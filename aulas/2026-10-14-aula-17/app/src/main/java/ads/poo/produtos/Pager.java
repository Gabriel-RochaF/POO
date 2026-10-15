package ads.poo.produtos;

public class Pager extends Produto{
    private int numLinhasDisplay;

    public Pager(int codigo, String numSerie, String modelo, double peso, double altura, double largura, double comprimento, int numLinhasDisplay) {
        super(codigo, numSerie, modelo, peso, altura, largura, comprimento);
        this.numLinhasDisplay = numLinhasDisplay;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero de linhas: " + numLinhasDisplay;
    }
}
