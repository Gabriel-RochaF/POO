package ads.poo.personagens;

public class Arqueiro extends Personagem {
    public Arqueiro() {
        super(35, 2, 1.0);
    }

    @Override
    public String movimentar() {
        return "O arqueiro correu com velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "O arqueiro atirou uma flecha com força " + ataque;
    }
}
