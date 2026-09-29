package ads.poo;

public class App {
    static void main(String[] args) {
        Motor v8 = new Motor(1,1);
        Carro fusca = new Carro("VW", v8);

        Aluno gabriel = new Aluno("Gabriel", "gabriel@example.com", new Endereco("rua","222","bairro", "cidade", "uf", "país", "cep"));
    }
}
