package FerroVelho.Classes;
import java.time.LocalDate;

//Atributos e declaracao
public class Usuario {
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private LocalDate datanasc;
    private Boolean ehAdmin;


    //Construtor
    public Usuario(String cpf, String email, String nome, String senha, LocalDate datanasc){
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.datanasc = datanasc;
        this.ehAdmin = false;
    }


    //Getters e Setters
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email){
        this.email= email;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }

    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDatanasc() {
        return this.datanasc;
    }
    public void setDatanasc(LocalDate datanasc){
        this.datanasc= datanasc;
    }

    public Boolean getEhAdmin() {
        return ehAdmin;
    }


    public void setEhAdmin(Boolean ehAdmin) {
        this.ehAdmin = ehAdmin;
    }
    
}
