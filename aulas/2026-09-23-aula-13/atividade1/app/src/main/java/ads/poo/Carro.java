package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }

    public void trocarMotor(Motor mo){
        this.propulsor = mo;
    }
}
