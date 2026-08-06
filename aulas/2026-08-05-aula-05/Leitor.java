import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String linha = leitor.nextLine();
            String[] campos = linha.split(",");
            double media = Math.round((Double.parseDouble(campos[1]) + Double.parseDouble(campos[2])) / 2);
            if (media >= 6) {
                IO.println(String.format("Aluno: %-7s Media: %.1f Aprovado", campos[0], media));
            } else {
                IO.println(String.format("Aluno: %-7s Media: %.1f Não Aprovado", campos[0], media));
            }
            
        }
        
        


        leitor.close();
    }
}
