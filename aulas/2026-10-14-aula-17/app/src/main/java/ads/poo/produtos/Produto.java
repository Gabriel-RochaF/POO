package ads.poo.produtos;

public class Produto {
    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Produto(int codigo, String numSerie, String modelo, double peso, double altura, double largura, double comprimento) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = new Dimensao(altura, largura, comprimento);
    }

    @Override
    public String toString() {
        return String.format("""
                Codigo: %d
                Numero de serie: %s
                modelo: %s
                peso: %.1f
                Dimensões: %s
                """, codigo, numSerie, modelo, peso, dimensao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }
}
