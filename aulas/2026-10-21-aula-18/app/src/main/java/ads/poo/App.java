package ads.poo;

import ads.poo.personagens.Aldeao;
import ads.poo.personagens.Arqueiro;
import ads.poo.personagens.Cavaleiro;

public class App {
    public static void main(String[] args) {
        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        IO.println(aldeao.movimentar());
        IO.println(aldeao.atacar() + "\n");

        IO.println(arqueiro.movimentar());
        IO.println(arqueiro.atacar() + "\n");

        IO.println(cavaleiro.movimentar());
        IO.println(cavaleiro.atacar() + "\n");
    }
}
