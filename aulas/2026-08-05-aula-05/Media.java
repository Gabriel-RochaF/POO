public class Media {
    public static void main(String[] args) {
        if (args.length == 2) {
            double nota1 = Double.parseDouble(args[0]);
            double nota2 = Double.parseDouble(args[1]);
            double media = (nota1 + nota2) / 2;
            media = Math.round(media);
            if (media >= 6) {
                IO.println(String.format("Sua media é %02.1f você foi aprovado", media));
            } else {
                IO.println(String.format("Sua media é %.1f você não foi aprovado", media));
            }
        } else {
            IO.println("ERRO: Insira no minimo e apenas 2 notas");
        }
    }
}
