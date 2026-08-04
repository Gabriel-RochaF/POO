public class Media {

    public static void main(String[] args) {
        
        String nome = IO.readln("Entre com seu nome: ");
        double nota1 = Double.parseDouble(IO.readln("Entre com a nota 1: "));
        double nota2 = Double.parseDouble(IO.readln("Entre com a nota 2: "));

        double media = Math.round((nota1 + nota2)/2.0);
         
        if (media >= 6){
            IO.println("Olá " + nome + " sua média é " + media + " você foi aprovado.");
        } else {
            IO.println("Olá " + nome + " sua média é " + media + " você não foi aprovado.");
        }
    }

}