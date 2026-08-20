package ads.poo;

public class Personagem {
    private int vida = 3;
    private int vidaMax = 3;

    public void reduzirVida(int dano){
        if (vida - dano >= 0){
            vida -= dano;
        } else {
            vida = 0;
        }
    }

    public void restaurarVida(int cura){
        if (vida + cura <= vidaMax){
            vida += cura;
        } else {
            vida = vidaMax;
        }
    }

    public int obterVida(){
        return vida;
    }

    public void definirVidaMax(int novoMax){
        vidaMax = novoMax;
    }
}
