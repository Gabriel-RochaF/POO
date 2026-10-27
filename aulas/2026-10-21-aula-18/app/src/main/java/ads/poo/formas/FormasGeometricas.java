package ads.poo.formas;

public class FormasGeometricas {
    protected String cor;
    protected Ponto pontoInicial;

    public String desenhar(){
        return String.format("A forma tem cor %s e começa na cordenada %s", cor, pontoInicial);
    }

    public FormasGeometricas(String cor, Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
        this.cor = cor;
    }
}
