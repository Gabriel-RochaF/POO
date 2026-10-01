package ads.poo;

public class Motor {
    private String tipo;
    private boolean ligado;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.ligado = false;
    }

    public void ligarDesligarMotor(){
        this.ligado = !this.ligado;
    }
}
