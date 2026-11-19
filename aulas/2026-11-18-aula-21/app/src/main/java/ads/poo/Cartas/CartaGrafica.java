package ads.poo.Cartas;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    private double CoordenadaX;
    private double CoordenadaY;
    private Boolean virada;

    public CartaGrafica(Naipe naipe, Valor valor, double coordenadaX, double coordenadaY, Boolean virada) {
        super(naipe, valor);
        this.CoordenadaX = coordenadaX;
        this.CoordenadaY = coordenadaY;
        this.virada = virada;
    }

    public void desenhar(Draw draw){
        String imagem = "cartas/" ;

        if (virada){
            switch (naipe){
                case PAUS,ESPADAS -> imagem += "fundoa.png";
                case COPAS,OUROS -> imagem += "fundov.png";
            }
        } else {
            imagem += this.nomeImagem();
        }
        draw.picture(this.CoordenadaX,this.CoordenadaY, imagem);
    }

    public void virar(){
        virada = !virada;
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
