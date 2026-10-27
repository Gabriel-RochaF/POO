package ads.poo.formas;

public class Retangulo extends FormaPlana {
    private Ponto pontoFinal;


    public Retangulo(String cor, Ponto pontoInicial, Ponto pontoFinal) {
        super(cor, pontoInicial);
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String desenhar() {
        return String.format("O Retangulo tem cor %s, começa na coordenada %s, termina na coordenada %s, tem area %.1f e perimetro %.1f", cor, pontoInicial,pontoFinal,calcularArea(),calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return calcularAltura() * calcularLargura();
    }

    @Override
    public double calcularPerimetro() {
        return 2*calcularLargura() + 2*calcularAltura();
    }

    private double calcularAltura(){
        return pontoFinal.y - pontoInicial.y;
    }
    private double calcularLargura(){
        return pontoFinal.x - pontoInicial.x;
    }
}
