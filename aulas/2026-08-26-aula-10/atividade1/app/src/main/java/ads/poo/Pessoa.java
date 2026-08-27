package ads.poo;

public class Pessoa {

    private static int contadorId = 1;
    private int id;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.id = contadorId;
        contadorId ++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("   ID: %d\n Nome: %s \nEmail: %s", id, nome, email);
    }
}
