package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private final double CONSUMO = 0.01;

    public Caneta(double nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(double nivelTinta) {
        this(nivelTinta, "azul");
    }

    public Caneta() {
       this(100.0);
    }

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString(){
        return "Cor: " + cor + "\nTinta: " + nivelTinta;
    }
    public double desenhar(int xInicial, int yInicial, int xFinal, int yFinal){
        double distancia = Math.sqrt(Math.pow(xFinal - xInicial, 2) + Math.pow(yFinal - yInicial, 2));
        double consumo = distancia * CONSUMO;
        if (nivelTinta - consumo >= 0.0){
            nivelTinta -= consumo;
            return consumo;
        } else {
            return -1;
        }
    }
}
