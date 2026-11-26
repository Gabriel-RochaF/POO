package ads.poo;

import ads.poo.exception.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        int a, b;
//
//        try {
//            a = Integer.parseInt(IO.readln("Entre com um número: "));
//            b = Integer.parseInt(IO.readln("Entre com um número: "));
//
//            int res = a / b;
//
//            System.out.println(String.format("%d / %d = %d",a,b,res));
//        }catch (NumberFormatException e){
//            System.err.println("Só é permitido números inteiros");
//        }catch (ArithmeticException e){
//            System.err.println("Não é possivel dividir por 0");
//        }
//        System.out.println("Fim do programa");

//        Conta conta = new Conta(100);
//        try {
//            conta.saque(200);
//        }catch (SaldoInsuficienteException e){
//            System.err.println("Erro: " + e.getMessage());
//        }
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livroA = new Livro("Livro A");
        Livro livroB = new Livro("Livro B");
        Livro livroC = new Livro("Livro C");
        Livro livroD = new Livro("Livro D");
        Livro livroE = new Livro("Livro E");

        livros.add(livroA);
        livros.add(livroB);
        livros.add(livroC);
        livros.add(livroD);
        livros.add(livroE);

        Usuario gabriel = new Usuario("Gabriel");
        Usuario cleiton = new Usuario("Cleiton");

        Biblioteca biblioteca = new Biblioteca(livros);

        try {
            biblioteca.emprestarLivros(livroA,gabriel);
            biblioteca.emprestarLivros(livroB,gabriel);
            biblioteca.emprestarLivros(livroC,gabriel);
            //biblioteca.emprestarLivros(livroD,gabriel);
            //biblioteca.emprestarLivros(livroC,cleiton);
            //biblioteca.devolverLivros(livroE,gabriel);
        } catch (LimiteEmprestimosAtingidoException e){
            System.err.println(e.getMessage());
        } catch (EmprestimoLivroJaEmprestadoException e){
            System.err.println(e.getMessage());
        } catch (DevolucaoLivroNaoEmprestadoException e){
            System.err.println(e.getMessage());
        } catch (BibliotecaException e) {
            System.err.println("Houve um Erro com a biblioteca");
        }
    }
}
