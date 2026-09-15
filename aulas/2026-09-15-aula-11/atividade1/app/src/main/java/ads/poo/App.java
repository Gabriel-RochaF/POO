package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Pessoa> agenda = new ArrayList<>();

        agenda.add(new Pessoa("Juca", "juca@example.org"));
        agenda.add(new Pessoa("Ana", "ana@example.org"));
        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
        agenda.add(new Pessoa("Juca", "juca2@example.com"));


        agenda.removeIf(e-> e.getNome().equals("Juca"));

        agenda.forEach(IO::println);

        /*
        ArrayList<String> lista = new ArrayList<>();

        lista.add("POO");
        lista.add("ADS");
        lista.add("IFSC");
        lista.add(1,"SJE");


        for(String e : lista){
            IO.println(e);
        }

        lista.forEach(e -> IO.println(e));

        lista.forEach(IO::println);

        lista.removeIf(e->e.equals("ADS"));

         */
    }
}
