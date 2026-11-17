package ads.poo;

public enum Planetas {
    MERCURIO(1, "Mercurio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8,"Netuno");

    public final int posicao;
    public final String nome;

    Planetas(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static Planetas getByPosicao(int p){
        for (Planetas planeta : Planetas.values()){
            if (p == planeta.posicao){
                return planeta;
            }
        }
        throw new IllegalArgumentException("posição invalida");
    }
}
