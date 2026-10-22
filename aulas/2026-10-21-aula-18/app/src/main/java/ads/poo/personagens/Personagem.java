package ads.poo.personagens;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String movimentar() {
        return "O personagem se movimentou com velocidade " + velocidade;
    }

    public String atacar() {
        return "O personagem atacou com força " + ataque;
    }
}
