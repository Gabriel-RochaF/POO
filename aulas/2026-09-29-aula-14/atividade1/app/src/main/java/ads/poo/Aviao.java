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
        for (int i = 0; i < numeroMotores; i++) {
            motores.add(new Motor(tipoMotores));
        }
    }
    public void ligarAviao(){
        ligado = true;
        for (Motor motor : motores){
            motor.ligarMotor();
        }
    }
    public void desligarAviao(){
        ligado = false;
        for (Motor motor : motores){
            motor.desligarMotor();
        }
    }
    public void ligarMotor(int i){
        Motor motor = motores.get(i);
        motor.ligarMotor();
    }
    public void desligarMotor(int i){
        Motor motor = motores.get(i);
        motor.desligarMotor();
    }
}
