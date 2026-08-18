package ads.poo;

public class App {
    public static void main(String[] args) {

        Carro fusca = new Carro();

        fusca.acelerar(90);

        IO.println(fusca.obterVelocidadeAtual());

        fusca.acelerar(20);

        IO.println(fusca.obterVelocidadeAtual());
    }
}
