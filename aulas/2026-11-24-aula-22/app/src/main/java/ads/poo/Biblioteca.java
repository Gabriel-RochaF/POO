package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void emprestarLivros(Livro livro, Usuario usuario){
        int livrosEmprestados = 0;
        for (Emprestimo e : emprestimos){
            
        }
    }

    public void devolverLivros(){

    }
}
