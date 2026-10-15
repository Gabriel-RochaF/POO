package ads.poo.produtos;

public class Telefone extends Produto{
    private String interfaceDiscagem;

    public Telefone(int codigo, String numSerie, String modelo, double peso, double altura, double largura, double comprimento, String interfaceDiscagem) {
        super(codigo, numSerie, modelo, peso, altura, largura, comprimento);
        this.interfaceDiscagem = interfaceDiscagem;
    }

    @Override
    public String toString() {
        return super.toString() + "Interface de Discagem: " + interfaceDiscagem;
    }
}
