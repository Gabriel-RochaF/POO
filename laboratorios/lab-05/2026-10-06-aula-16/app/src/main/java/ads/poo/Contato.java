package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, String dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = LocalDate.parse(dataNasc, formato);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc.format(formato);
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = LocalDate.parse(dataNasc, formato);
    }

    public boolean addTelefone(String rotulo, String valor){
        if (!this.telefones.containsKey(rotulo)){
            telefones.put(rotulo,new Telefone(valor));
            return true;
        } else {
            return false;
        }
    }

    public String getTelefone(String rotulo){
        Telefone telefone = telefones.get(rotulo);
        return telefone.toString();
    }

    public boolean addEmail(String rotulo, String valor){
        if (!this.emails.containsKey(rotulo)){
            emails.put(rotulo,new Email(valor));
            return true;
        } else {
            return false;
        }
    }

    public String getEmail(String rotulo){
        Email email = emails.get(rotulo);
        return email.getValor();
    }

    public boolean removeTelefone(String rotulo){
        if (telefones.remove(rotulo) != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean removeEmail(String rotulo){
        if (emails.remove(rotulo) != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String valor){
        if (telefones.put(rotulo,new Telefone(valor)) != null ){
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String valor){
        if (emails.put(rotulo,new Email(valor)) != null ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder telefones = new StringBuilder();
        StringBuilder emails = new StringBuilder();
        this.telefones.forEach((rotulo, telefone) -> telefones.append(rotulo + telefone.toString() + "\n"));
        this.emails.forEach((rotulo, email) -> emails.append(rotulo + email.toString() + "\n"));
        return String.format(" Nome: %s %s\n Data Nascimento: %s \n telefones: \n %s emails: \n %s ", this.nome, this.sobrenome, this.dataNasc.format(formato),telefones.toString(),emails.toString());
    }
}
