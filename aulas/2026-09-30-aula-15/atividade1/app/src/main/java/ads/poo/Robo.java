package ads.poo;

public class Robo {
    private int[] posicao;
    private int[] tamanhoArea;
    private Bateria bateria;
    private int consumo;

    public Robo(int[] posicao, int[] tamanhoArea,int carga, int consumo) {
        this.posicao = posicao;
        this.tamanhoArea = tamanhoArea;
        this.bateria = new Bateria(carga);
        this.consumo = consumo;
    }

    public boolean andar(int quadrantes, char direcao){
        switch (direcao){
            case 'N','L','S','O' -> {
                if (bateria.consumirBateria(quadrantes * consumo)) {

                }
            }
            default -> {
                return false
            }
        }
    }
}
