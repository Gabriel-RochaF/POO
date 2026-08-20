package ads.poo;

public class App {
    public static void main(String[] args) {
        Disciplina POO = new Disciplina();
        POO.definirCurso("ADS");
        POO.definirDisciplina("POO");
        POO.definirCargaHorariaPresencial(60);
        POO.definirCargaHorariaEaD(20);

        IO.println("Curso: " + POO.obterCurso());
        IO.println("Disciplina: " + POO.obterDisciplina());
        IO.println(String.format("Carga Horaria Total: %s (%d h presencial / %d h EaD)", POO.obterCargaHorariaTotal(), POO.obterCargaHorariaPresencial(), POO.obterCargaHorariaEaD()));
    }
}