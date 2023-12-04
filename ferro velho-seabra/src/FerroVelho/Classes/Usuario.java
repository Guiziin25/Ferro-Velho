package FerroVelho.Classes;
import java.sql.SQLOutput;
import java.time.LocalDate;

//Atributos e declaracao
public class Usuario {
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private LocalDate datanasc;
    private EnumTipoUser tipo;
    private String login;



    //Construtor
    public Usuario(String cpf, String email, String nome, String senha, LocalDate datanasc){
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.datanasc = datanasc;
        this.tipo = EnumTipoUser.NORMAL;
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

     public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
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

   public EnumTipoUser getTipo() {
        return tipo;
    }


    public void setTipo(EnumTipoUser tipo) {
        this.tipo = tipo;
    }

    //metodo pra testar a classe no main
    public void perfil(){
        System.out.println("as informações do usuario são:");
        System.out.printf("nome:",getNome());
        System.out.printf("cpf:", getCpf());
        System.out.printf("email:",getEmail());
        System.out.printf("login:", getLogin());
        System.out.printf("senha:", getSenha());
        System.out.printf("data de nascimento:", getDatanasc());
        System.out.printf("tipo:", getTipo());

    }
}
