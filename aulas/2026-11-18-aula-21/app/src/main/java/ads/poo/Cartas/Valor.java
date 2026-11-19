package ads.poo.Cartas;

public enum Valor {
    AS(1,"1"),
    DOIS(2,"2"),
    TRES(3,"3"),
    QUATRO(4,"4"),
    CINCO(5,"5"),
    SEIS(6,"6"),
    SETE(7,"7"),
    OITO(8,"8"),
    NOVE(9,"9"),
    DEZ(10,"10"),
    VALETE(11,"j"),
    DAMA(12,"q"),
    REI(13,"k");

    public final int valor;
    public final String simbolo;

    Valor(int valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}
