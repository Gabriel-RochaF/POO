package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /*
        Disciplina poo = new Disciplina("POO", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.QUARTA});
        Disciplina fe = new Disciplina("FE", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.SEXTA});
        Disciplina est = new Disciplina("EST", new DiaDaSemana[]{DiaDaSemana.QUARTA, DiaDaSemana.SEXTA});

        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        disciplinas.add(poo);
        disciplinas.add(fe);
        disciplinas.add(est);

        for (Disciplina d : disciplinas){
            for (DiaDaSemana dia : d.getDiasDaSemana()){
                if (dia.equals(DiaDaSemana.TERCA)){
                    IO.println(d.getSigla());
                }
            }
        }
        */

        IO.println(Planetas.getByPosicao(5));
    }
}
