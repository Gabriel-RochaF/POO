package ads.poo.Cartas;

public class Carta {
    protected Valor valor;
    protected Naipe naipe;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + ""+ naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
