public class MediaTurma {
    public static void main(String[] args) {
        double[][] notas = new double[4][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                notas[i][j] = Double.parseDouble(IO.readln(String.format("entre com a nota da avaliação %d do aluno %d: ", (j + 1), (i + 1) )));
                notas[i][2] += notas[i][j]; 
            }
            notas[i][2] = Math.round(notas[i][2]/2);
        }
        IO.println("              Av1     Av2    Media");
        for (int i = 0; i < 3; i++) {
            IO.print(String.format("aluno %d: ",i));
            for (int j = 0; j < 3; j++) {
                IO.print(String.format("%8.1f", notas[i][j]));
            }
            IO.println();
        }

        IO.print("Media G: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                notas[3][i] += notas[j][i];
            }
            notas[3][i] = Math.round(notas[3][i]/3);
            IO.print(String.format("%8.1f", notas[3][i]));
        }
        IO.println();

    }
}
