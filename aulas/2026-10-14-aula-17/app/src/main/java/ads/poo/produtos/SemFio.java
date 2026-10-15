package ads.poo.produtos;

public class SemFio extends Produto {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, double altura, double largura, double comprimento, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, altura, largura, comprimento);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Frequencia: %.1f \nCanais: %d \nDistancia de operação: %.1f", frequencia,canais,distanciaOperacao );
    }
}
