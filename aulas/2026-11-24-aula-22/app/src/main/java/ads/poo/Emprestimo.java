package ads.poo;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Boolean ativo;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.ativo = true;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
