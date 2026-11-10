package ads.poo;

import ads.poo.formas.Circulo;
import ads.poo.formas.Linha;
import ads.poo.formas.Ponto;
import ads.poo.formas.Retangulo;
import ads.poo.personagens.Aldeao;
import ads.poo.personagens.Arqueiro;
import ads.poo.personagens.Cavaleiro;

public class App {
    public static void main(String[] args) {
        /* Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        IO.println(aldeao.movimentar());
        IO.println(aldeao.atacar() + "\n");

        IO.println(arqueiro.movimentar());
        IO.println(arqueiro.atacar() + "\n");

        IO.println(cavaleiro.movimentar());
        IO.println(cavaleiro.atacar() + "\n");*/


        Linha linha = new Linha("Azul", new Ponto(3,4), new Ponto(5,8));
        Retangulo retangulo = new Retangulo("Verde", new Ponto(2,3), new Ponto(6,7));
        Circulo circulo = new Circulo("vermelhor",new Ponto(4,6),3.0);

        IO.println(linha.desenhar());
        IO.println(retangulo.desenhar());
        IO.println(circulo.desenhar());

    }
}
