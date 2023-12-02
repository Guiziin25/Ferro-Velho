package FerroVelho.Classes;

import FerroVelho.Dados.InterfaceLogin;

public class Login implements InterfaceLogin {
    private String email;
    private String usuario;
    private String senha;

    //construtor da classe
    public Login(String em, String us, String sn){
        this.email= em;
        this.usuario=us;
        this.senha=sn;
    }

    //Getters e Setters
    public String getUsuario(){return this.usuario;}
    public void setUsuario(String usuario){this.usuario=usuario;}
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email=email;}
    public String getSenha(){return this.senha;}
    public void setSenha(String senha){this.senha=senha;}

    public void login() {}
    public void limpar() {}
}