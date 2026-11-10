package ads.poo.formas;

public abstract class FormasGeometricas {
    protected String cor;
    protected Ponto pontoInicial;

    public abstract String desenhar();

    public FormasGeometricas(String cor, Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
        this.cor = cor;
    }
}
