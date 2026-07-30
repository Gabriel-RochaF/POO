void main(){
    String sigla = IO.readln("Entre com a sigla da disciplina: ");
    String[] dias = new String[5];
    int i = 0;
    while (i < dias.length) {
        String dia = IO.readln("Informe o dia da semana ou não para encerrar: ");
        dias[i] = switch (dia) {
            case "seg","ter","qua","qui","sex" -> dia;   
            default -> null;
        };
        if (dia.equals("não")) {
            i = dias.length;
        } else if (dias[i] == null) {
            IO.println("ERRO: Valor inválido. Entre com: seg, ter, qua, qui ou sex");
        } else {
            i ++;
        }
    } ;
    IO.println("na disciplina " + sigla + " você tem aulas nos seguinte dias: ");
    for (int d = 0; d < dias.length; d++){
        if (dias[d] != null){
            IO.println("- " + dias[d]);
        }
    }
}