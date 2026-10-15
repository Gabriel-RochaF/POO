package ads.poo.produtos;

public class Dimensao {
    private double altura;
    private double largura;
    private double comprimento;

    public Dimensao(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return String.format("Altura: %.1f , Largura: %.1f , Comprimento: %.1f", altura, largura, comprimento);
    }
}
