package ads.poo.veiculos;

public abstract class Veiculo {
    private final String id;
    private int velocidadeAtual;
    private int velocidadeAceleracao;
    private static final int VELOCIDADE_MAXIMA = 200;

    public Veiculo(String id, int velocidadeAceleracao) {
        this.id = id;
        this.velocidadeAceleracao = velocidadeAceleracao;
    }

    public void acelerar(){
        if (velocidadeAtual + velocidadeAceleracao <= VELOCIDADE_MAXIMA){
            velocidadeAtual += velocidadeAceleracao;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    public void frear(){
        if (velocidadeAtual - velocidadeAceleracao >= 0){
            velocidadeAtual -= velocidadeAceleracao;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String getId() {
        return id;
    }

}
