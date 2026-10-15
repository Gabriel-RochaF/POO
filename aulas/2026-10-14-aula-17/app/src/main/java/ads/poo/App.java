package ads.poo;

import ads.poo.produtos.SemFio;
import ads.poo.produtos.Produto;

public class App {
    public static void main(String[] args) {
        Produto telefone = new Produto(12345,"10001","a25",2.5,7.0,2.0,3.0);
        SemFio telefoneSemFio = new SemFio(678910,"22222","s30",3.0,8.0,3.0,4.5,5.5,10,15.0);

        IO.println(telefone);
        IO.println(telefoneSemFio);
    }
}
