package ads.poo;

public class Livro {
    private final String ISBN;
    private String titulo;
    private String autor;
    private String anoDePublicacao;

    public Livro(String ISBN, String titulo, String autor, String anoDePublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}
