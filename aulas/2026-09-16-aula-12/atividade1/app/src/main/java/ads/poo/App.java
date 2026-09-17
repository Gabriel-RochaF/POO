package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        ArrayList<Pessoa> agenda = new ArrayList<>();

        agenda.add(new Pessoa("Juca", "juca@example.org"));
        agenda.add(new Pessoa("Ana", "ana@example.org"));
        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
        agenda.add(new Pessoa("Juca", "juca2@example.com"));


        agenda.removeIf(e-> e.getNome().equals("Juca"));

        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("123", "Juca");
        mapa.put("456", "Ana");
        mapa.put("789", "Pedro");

        String nome = mapa.get("456");

        mapa.remove("456");

        mapa.forEach((chave, valor) -> IO.println("Chave: " + chave + ", valor: " + valor));


    }
}
