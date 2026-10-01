package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private double capCombustivel;
    private boolean ligado;
    private ArrayList<Motor> motores = new ArrayList<>();

    public Aviao(int maxTripulantes, int maxPassageiros, double capCombustivel, int numeroMotores, String tipoMotores) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.capCombustivel = capCombustivel;
        this.ligado = false;
        for (int i = 0; i < numeroMotores; i++) {
            motores.add(new Motor(tipoMotores));
        }
    }
    public void ligarDesligarAviao(){
        this.ligado = !this.ligado;
        for (Motor motor : motores) {
            motor.ligarDesligarMotor();
        }
    }

    public void ligarDesligarMotor(int i){
        Motor motor = motores.get(i);
        motor.ligarDesligarMotor();
    }
}
