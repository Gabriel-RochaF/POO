package ads.poo;

import ads.poo.Cartas.Carta;
import ads.poo.Cartas.CartaGrafica;
import ads.poo.Cartas.Naipe;
import ads.poo.Cartas.Valor;
import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<>();

        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                baralho.add(new Carta(n,v));
            }
        }

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setXscale(0,800);
        draw.setYscale(0,800);

        CartaGrafica c = new CartaGrafica(Naipe.COPAS,Valor.TRES, 400,400);
        c.desenhar(draw);
    }
}
