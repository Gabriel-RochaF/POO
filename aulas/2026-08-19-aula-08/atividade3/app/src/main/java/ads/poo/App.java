package ads.poo;

public class App {
    public static void main(String[] args) {
        Batedeira b9000 = new Batedeira();

        b9000.definirModelo("b9000");

        b9000.definirPreco(200.0);

        b9000.definirVoltagem(220);

        IO.println(String.format("O modelo da batedeira é %s, o preço é de R$%.2f e a voltagem é de %d", b9000.obterModelo(), b9000.obterPreco(), b9000.obterVoltagem()));
    }
}
