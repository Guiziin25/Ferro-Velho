import java.time.LocalDate;

public class Cliente {
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private LocalDate datanasc;
    private Carrinho carrinho;

    public Cliente(String c, String e, String n, String s, LocalDate d, Carrinho a){ //construtor
        this.cpf = c;
        this.email = e;
        this.nome = n;
        this.senha = s;
        this.datanasc = d;
        this.carrinho = a;
    }


    public String getCpf(){ //getters e setters
        return this.cpf;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String e){
        this.email= e;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome= n;
    }

    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String s) {
        this.senha = s;
    }

    public LocalDate getDatanasc() {
        return this.datanasc;
    }
    public void setDatanasc(LocalDate n){
        this.datanasc= n;
    }
    
    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
