package ads.poo;

import ads.poo.exception.BibliotecaException;
import ads.poo.exception.DevolucaoLivroNaoEmprestadoException;
import ads.poo.exception.EmprestimoLivroJaEmprestadoException;
import ads.poo.exception.LimiteEmprestimosAtingidoException;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = livros;
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void emprestarLivros(Livro livro, Usuario usuario) throws BibliotecaException {
        int livrosEmprestados = 0;
        for (Emprestimo e : emprestimos){
            if (e.getAtivo() && e.getUsuario() == usuario){
                livrosEmprestados ++;
            } else if (e.getAtivo() && e.getLivro() == livro){
                throw new EmprestimoLivroJaEmprestadoException("O livro solicitado já foi emprestado");
            }
            if (livrosEmprestados >= 3){
                throw new LimiteEmprestimosAtingidoException("Limite de imprestimos atingido (3)");
            }
        }
        if (!usuarios.contains(usuario)){
            usuarios.add(usuario);
        }
        emprestimos.add(new Emprestimo(livro,usuario));
    }

    public void devolverLivros(Livro livro, Usuario usuario) throws BibliotecaException{
        for (Emprestimo e : emprestimos){
            if (e.getAtivo() && e.getLivro() == livro && e.getUsuario() == usuario){
                e.desativarEmprestimo();
                return;
            }
        }
        throw new DevolucaoLivroNaoEmprestadoException("O livro que foi tentado devolver não foi emprestado");
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
