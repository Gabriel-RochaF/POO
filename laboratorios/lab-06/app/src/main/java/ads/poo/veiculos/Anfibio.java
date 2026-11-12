package ads.poo.veiculos;

public abstract class Anfibio extends Veiculo {
    private int lastro;
    private int capacidadeLastro;
    private boolean rodasRecolhidas;

    public Anfibio(String id, int velocidadeAceleracao, int capacidadeLastro) {
        super(id, velocidadeAceleracao);
        this.lastro = 0;
        if (capacidadeLastro <= 100){
            this.capacidadeLastro = capacidadeLastro;
        } else {
            this.capacidadeLastro = 100;
        }
        this.rodasRecolhidas = false;
    }

    public void recolherRodas(){
        rodasRecolhidas = !rodasRecolhidas;
    }

    public void esvaziarLastro(){
        lastro = 0;
    }

    public boolean preencherLastro(int litros){
        if (rodasRecolhidas){
            return false;
        } else if (lastro + litros <= capacidadeLastro ){
            lastro += litros;
        } else {
            lastro = capacidadeLastro;
        }
        return true;
    }
}
