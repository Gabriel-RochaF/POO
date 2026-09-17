package ads.poo;

import java.util.HashMap;

public class App {
    private HashMap<String, Livro> livros = new HashMap<>();

    public void cadastrar(){
        String isbn = IO.readln("Entre com o ISBN: ");
        if (livros.get(isbn) == null){
            String titulo = IO.readln("Entre com o titulo do livro: ");
            String autor = IO.readln("Entre com o autor do livro");
            String anoDePublicacao = IO.readln("Entre com o ano de publicação do livro");
            livros.put(isbn, new Livro(isbn, titulo, autor, anoDePublicacao));
        } else {
            IO.println("ISBN já cadastrado");
        }

    }

    public void listarLivros(){
        livros.forEach((ISBN , livro) -> IO.println("ISBN: " + ISBN + " livro: " + livro.getTitulo()));
    }

    public void pesquisarISBN(){
        String isbn = IO.readln("Entre com o ISBN: ");
        Livro livro = livros.get(isbn);
        IO.println(String.format("Título: %s, Autor: %s, Ano de publicação: %s",livro.getTitulo(), livro.getAutor(), livro.getAnoDePublicacao()));
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

        l.setTitulo(IO.readln("Entre com o Titulo atualizado: "));
        l.setAutor(IO.readln("Entre com o Autor atualizado: "));
        l.setAnoDePublicacao(IO.readln("Entre com o ano de publicação atualizado: "));
    }

    public void removerLivro(){
        String isbn = IO.readln("Entre com o ISBN do livro para remove-lo: ");
        livros.remove(isbn);
    }


    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar = true){
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
        }
    }
}
