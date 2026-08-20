package ads.poo;

public class Batedeira {
    private double preco;
    private String modelo;
    private int voltagem;

    public void definirModelo(String nomeModelo){
        modelo = nomeModelo;
    }

    public void definirPreco(double valor){
        preco = valor;
    }

    public void definirVoltagem(int valor){
        voltagem = valor;
    }

    public String obterModelo(){
        return modelo;
    }

    public double obterPreco(){
        return preco;
    }

    public int obterVoltagem(){
        return voltagem;
    }
}
