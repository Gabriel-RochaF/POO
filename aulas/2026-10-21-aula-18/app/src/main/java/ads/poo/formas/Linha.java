package ads.poo.formas;

public class Linha extends FormasGeometricas{

    private Ponto pontoFinal;

    public Linha(String cor, Ponto pontoInicial, Ponto pontoFinal) {
        super(cor, pontoInicial);
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String desenhar() {
        return String.format("A Linha tem cor %s, começa na coordenada %s e termina na coordenada %s", cor, pontoInicial,pontoFinal);
    }
}
