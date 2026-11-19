package ads.poo.Cartas;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    private double CoordenadaX;
    private double CoordenadaY;

    public CartaGrafica(Naipe naipe, Valor valor, double coordenadaY, double coordenadaX) {
        super(naipe, valor);
        CoordenadaY = coordenadaY;
        CoordenadaX = coordenadaX;
    }

    public void desenhar(Draw draw){
        draw.picture(this.CoordenadaX,this.CoordenadaY, "cartas/" + this.nomeImagem());
    }

    public String nomeImagem(){
        return this.valor.simbolo + this.naipe.letra +".png";
    }

    public double getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        CoordenadaY = coordenadaY;
    }
}
