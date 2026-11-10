package ads.poo.Animais;

public class Morcego extends Animal implements Voador{
    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "";
    }

    @Override
    public String voar() {
        return "";
    }
}
