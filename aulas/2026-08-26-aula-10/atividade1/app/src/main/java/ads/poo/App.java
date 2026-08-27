package ads.poo;

public class App {

    private Pessoa[] vetor = new Pessoa[100];

    public static void main(String[] args) {
        int opcao;
        App app = new App();
        do {
            app.menu();
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
            IO.println();
            switch (opcao){
                case 1 -> {
                    String nome = IO.readln("Entre com o nome da pessoa para o cadastro: ");
                    String email = IO.readln("Entre com email da pessoa para o cadastro: ");
                    app.cadastrar(nome,email);
                }
                case 2 -> app.listarPessoas();
                case 3 -> {
                    String nome = IO.readln("Entre com o nome da pessoa: ");
                    IO.println();
                    app.imprimirDados(nome);
                }
            }
        } while (opcao != 4);
    }
    public void menu(){
        String m = """
                
                1 - Cadastrar
                2 - Listar todas pessoas
                3 - Imprimir daods de uma pessoa
                4 - Sair
                """;
        IO.println(m);
    }

    public void cadastrar(String nome, String email) {
        Pessoa novaPessoa = new Pessoa(nome, email);
        for (int i = 0; i < vetor.length; i++) {
            if (novaPessoa.getId() - 1 == i){
                vetor[i] = novaPessoa;
            }
        }
    }

    public void listarPessoas(){
        for (Pessoa p : vetor){
            if (p != null) {
                IO.println(String.format("|ID: %3d | Nome: %S", p.getId(), p.getNome()));
            }
        }
    }

    public void imprimirDados(String nome){
        for (Pessoa p : vetor) {
            if (p != null){
                if (p.getNome().equals(nome)){
                    IO.println(" " + p.toString());
                }
            }
        }
    }
}
