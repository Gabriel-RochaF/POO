package ads.poo;

public class Motor {
    private String tipo;
    private boolean ligado;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.ligado = false;
    }

    public void ligarMotor(){
        this.ligado = true;
    }

    public void desligarMotor(){
        this.ligado = false;
    }
}
