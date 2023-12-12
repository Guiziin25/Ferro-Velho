package FerroVelho.Classes;
import java.sql.SQLOutput;
import java.time.LocalDate;

//Atributos e declaracao
public abstract class Usuario {
    private int id;
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private String login;

    //Construtor
    public Usuario(String login,String cpf, String email, String nome, String senha, int id){
        this.login= login;
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.id= id;
    }
    //getter abstrato
    public abstract String getTipoUsuario();


    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }

     public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
