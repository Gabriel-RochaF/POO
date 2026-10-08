package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String valor;

    public Telefone(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return formata(valor);
    }

    private String formata(String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter("(##) #####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
