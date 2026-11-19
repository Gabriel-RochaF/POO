package ads.poo;

import ads.poo.Cartas.Carta;
import ads.poo.Cartas.CartaGrafica;
import ads.poo.Cartas.Naipe;
import ads.poo.Cartas.Valor;
import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<CartaGrafica> baralho = new ArrayList<>();

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setXscale(0,800);
        draw.setYscale(0,800);

        double x = 36;
        double y = 800 - 48;
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                baralho.add(new CartaGrafica(n,v,x,y,false));
                x += 60.7;

            }
            y -= 96;
            x = 36;
        }

        for (CartaGrafica c : baralho){
            c.desenhar(draw);
        }

    }
}
