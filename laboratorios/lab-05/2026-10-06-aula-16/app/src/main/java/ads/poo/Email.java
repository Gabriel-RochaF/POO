package ads.poo;

public class Email {
    private String valor;

    public Email(String valor) {
        if (validadorEmail(valor)) {
            this.valor = valor;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if (validadorEmail(valor)) {
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return valor;
    }

    private boolean validadorEmail(String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return valor.matches(eR);
    }
}
