package ads.poo;

public class Disciplina {
    private String curso;
    private String disciplina;
    private int cargaHorariaPresencial;
    private int cargaHorariaEaD;

    public void definirCurso(String nome){
        curso = nome;
    }

    public void definirDisciplina(String nome){
        disciplina = nome;
    }

    public void definirCargaHorariaEaD(int horas){
        cargaHorariaEaD = horas;
    }

    public void definirCargaHorariaPresencial(int horas){
        cargaHorariaPresencial = horas;
    }

    public String obterCurso(){
        return curso;
    }

    public String obterDisciplina(){
        return disciplina;
    }

    public int obterCargaHorariaPresencial(){
        return cargaHorariaPresencial;
    }
    public int obterCargaHorariaEaD(){
        return cargaHorariaEaD;
    }
    public int obterCargaHorariaTotal(){
        return cargaHorariaPresencial + cargaHorariaEaD;
    }
}
