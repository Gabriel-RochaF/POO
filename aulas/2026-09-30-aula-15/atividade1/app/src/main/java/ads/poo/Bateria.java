package ads.poo;

public class Bateria {
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public boolean consumirBateria(int consumo){
        if (carga - consumo >= 0){
            carga -= consumo;
            return true;
        } else {
            return false;
        }
    }
}
