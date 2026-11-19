package ads.poo.Cartas;

public enum Naipe {
    OUROS(1, "\u2662",'o'),
    ESPADAS(2,"\u2660",'e'),
    COPAS(3,"\u2661",'c'),
    PAUS(4,"\u2663",'p');

    public final int codigo;
    public final String naipe;
    public final char letra;

    Naipe(int codigo, String naipe, char letra) {
        this.codigo = codigo;
        this.naipe = naipe;
        this.letra = letra;
    }

    @Override
    public String toString() {
        return naipe;
    }
}
