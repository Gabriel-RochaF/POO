package ads.poo;

import java.util.HashMap;

public class App {
    private HashMap<String, Livro> livros = new HashMap<>();

    public void cadastrar(){
        String isbn = IO.readln("Entre com o ISBN: ");
        if (livros.get(isbn) == null){
            String titulo = IO.readln("Entre com o titulo do livro: ");
            String autor = IO.readln("Entre com o autor do livro: ");
            String anoDePublicacao = IO.readln("Entre com o ano de publicação do livro: ");
            livros.put(isbn, new Livro(isbn, titulo, autor, anoDePublicacao));
        } else {
            IO.println("ISBN já cadastrado");
        }

    }

    public void listarLivros(){
        livros.forEach((ISBN , livro) -> IO.println("ISBN: " + ISBN + " livro: " + livro.getTitulo()));
    }

    public void consultarISBN(){
        String isbn = IO.readln("Entre com o ISBN: ");
        Livro livro = livros.get(isbn);
        if (livro != null) {
            IO.println(String.format("Título: %s, Autor: %s, Ano de publicação: %s", livro.getTitulo(), livro.getAutor(), livro.getAnoDePublicacao()));
        } else {
            IO.println("Nenhum livro cadastrado com esse ISBN");
        }
    }

    public void consultarAutor(){
        String autor = IO.readln("Entre com o autor do livro: ");
        for (Livro l : livros.values()){
            if (l.getAutor().equals(autor)){
                IO.println("ISBN: " + l.getISBN() + " livro: " + l.getTitulo());;
            }
        }
    }

    public void consultarAnoDePublicacao(){
        String ano = IO.readln("Entre com o ano de publicação do livro: ");
        for (Livro l : livros.values()){
            if (l.getAnoDePublicacao().equals(ano)){
                IO.println("ISBN: " + l.getISBN() + " livro: " + l.getTitulo());;
            }
        }
    }

    public void atualizarDados(){
        String isbn = IO.readln("Entre com o ISBN do livro para atualizar os dados: ");
        Livro l = livros.get(isbn);
        if (l != null) {

            l.setTitulo(IO.readln("Entre com o Titulo atualizado: "));
            l.setAutor(IO.readln("Entre com o Autor atualizado: "));
            l.setAnoDePublicacao(IO.readln("Entre com o ano de publicação atualizado: "));
        } else {
            IO.println("Nenhum livro cadastrado com esse ISBN");
        }
    }

    public void removerLivro(){
        String isbn = IO.readln("Entre com o ISBN do livro para remove-lo: ");
        var r = livros.remove(isbn);
        if (r != null) {
            IO.println("Livro removido");
        } else {
            IO.println("Nenhum livro cadastrado com esse ISBN");
        }
    }


    public static void main(String[] args) {
        boolean continuar = true;
        App app = new App();
        while (continuar){
            IO.println("""
                    
                    1. Cadastrar um livro;
                    2. Listar somente ISBN e título de todos os livros cadastrados;
                    3. Consultar um livro pelo ISBN e exibir seus dados
                    4. Consultar livros por autor e exibir somente ISBN e título;
                    5. Consultar livros por ano de publicação e exibir somente ISBN e título;
                    6. Atualizar os dados de um livro, exceto o ISBN;
                    7. Remover um livro;
                    8. Sair do sistema.
                    
                    """);
            int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
            switch (opcao){
                case 1 -> app.cadastrar();
                case 2 -> app.listarLivros();
                case 3 -> app.consultarISBN();
                case 4 -> app.consultarAutor();
                case 5 -> app.consultarAnoDePublicacao();
                case 6 -> app.atualizarDados();
                case 7 -> app.removerLivro();
                case 8 -> continuar = false;
                default -> IO.println("[ERRO] Opção invalida");
            }
        }
    }
}
