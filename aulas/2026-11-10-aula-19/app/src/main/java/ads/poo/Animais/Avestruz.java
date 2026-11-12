package ads.poo.Animais;

public class Avestruz extends Animal implements Terrestre {
    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return nome + " é um Avestruz";
    }

    @Override
    public String emitirSom() {
        return "";
    }

    @Override
    public String corre() {
        return "O avestruz correu";
    }
}
