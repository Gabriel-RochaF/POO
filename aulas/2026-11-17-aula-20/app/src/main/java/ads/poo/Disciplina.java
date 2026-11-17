package ads.poo;

public class Disciplina {
    private String sigla;
    private DiaDaSemana[] diasDaSemana;

    public Disciplina(String sigla, DiaDaSemana[] diasDaSemana) {
        this.sigla = sigla;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String toString() {
        StringBuilder dias = new StringBuilder();
        for (DiaDaSemana dia : diasDaSemana) {
            dias.append(String.format("- %s \n", dia));
        }
        return String.format("Sigla: %s \nDias com aula: \n%s", sigla, dias);
    }

    public String getSigla() {
        return sigla;
    }

    public DiaDaSemana[] getDiasDaSemana() {
        return diasDaSemana;
    }
}
