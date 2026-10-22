package ads.poo.personagens;

public class Cavaleiro extends Personagem{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String movimentar() {
        return "O cavaleiro cavalgou com velocidade " + velocidade;
    }

    @Override
    public String atacar() {
        return "O cavaleiro deu uma investida de força " + ataque + " com sua lança";
    }
}
