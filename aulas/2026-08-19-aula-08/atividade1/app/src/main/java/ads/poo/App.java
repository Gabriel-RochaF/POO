package ads.poo;

public class App {
       public static void main(String[] args) {
           Contador contador = new Contador();

           contador.atribuirValor(10);

           IO.println(contador.obterValorAtual());

           contador.incrementar1();
           IO.println(contador.obterValorAtual());

           contador.atribuirValor(50);
           IO.println(contador.obterValorAtual());


    }
}
