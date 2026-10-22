package ads.poo.personagens;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String movimentar() {
        return "O aldeão caminhou com velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "O aldeão socou com força " + ataque;
    }
}
