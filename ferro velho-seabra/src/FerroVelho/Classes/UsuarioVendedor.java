package FerroVelho.Classes;

public class UsuarioVendedor extends Usuario{
    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private String login;
    public UsuarioVendedor(String login, String cpf, String email, String nome, String senha) {
        super(login, cpf, email, nome, senha);
    }
    //metodos de Vendedor
    public void anunciarPeca(){};
    public void finalizavenda(){}

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
    //metodo pra testar a classe no main
    public void perfil(){
        System.out.println("as informações do usuario são:");
        System.out.printf("nome:",this.getNome());
        System.out.printf("cpf:", this.getCpf());
        System.out.printf("email:",this.getEmail());
        System.out.printf("login:", this.getLogin());
        System.out.printf("senha:",this.getSenha());

    }
}
