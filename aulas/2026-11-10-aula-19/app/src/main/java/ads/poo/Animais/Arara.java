package ads.poo.Animais;

public class Arara extends Animal implements Voador{
    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return nome + "é uma arara";
    }

    @Override
    public String emitirSom() {
        return "A arara falou";
    }

    @Override
    public String voar() {
        return "A arara voou";
    }
}
