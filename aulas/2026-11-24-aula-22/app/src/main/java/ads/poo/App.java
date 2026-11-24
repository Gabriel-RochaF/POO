package ads.poo;

import ads.poo.exception.SaldoInsuficienteException;

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

        Conta conta = new Conta(100);
        try {
            conta.saque(200);
        }catch (SaldoInsuficienteException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
