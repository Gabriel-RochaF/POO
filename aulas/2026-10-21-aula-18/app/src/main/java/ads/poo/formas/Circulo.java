package ads.poo.formas;

public class Circulo extends FormaPlana {
    private double raio;

    public Circulo(String cor, Ponto pontoInicial, double raio) {
        super(cor, pontoInicial);
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return String.format("O Circulo tem cor %s, seu centro está na coordenada %s, tem raio de %.1f, tem area %.1f e perimetro %.1f", cor, pontoInicial,raio,calcularArea(),calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
