import java.time.LocalDate;

//Atributos e declaracao
public class Cliente {
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private LocalDate datanasc;
    private Carrinho carrinho;

    //Construtor
    public Cliente(String cpf, String email, String nome, String senha, LocalDate datanasc, Carrinho carrinho){
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.datanasc = datanasc;
        this.carrinho = carrinho;
    }


    //Getters e Setters
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String c) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String e){
        this.email= email;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome= nome;
    }

    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String s) {
        this.senha = senha;
    }

    public LocalDate getDatanasc() {
        return this.datanasc;
    }
    public void setDatanasc(LocalDate n){
        this.datanasc= datanasc;
    }
    
    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
