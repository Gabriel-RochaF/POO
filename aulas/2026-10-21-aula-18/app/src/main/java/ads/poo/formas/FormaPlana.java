package ads.poo.formas;

public abstract class FormaPlana extends FormasGeometricas{
    public FormaPlana(String cor, Ponto pontoInicial) {
        super(cor, pontoInicial);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
