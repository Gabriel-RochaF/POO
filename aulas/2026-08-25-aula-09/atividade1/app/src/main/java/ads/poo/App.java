package ads.poo;

public class App {

    public static void main(String[] args) {
        Caneta a = new Caneta(100, "azul");
        Caneta b = new Caneta(50);
        Caneta c = new Caneta();

        IO.println(a.toString());
    }
}
