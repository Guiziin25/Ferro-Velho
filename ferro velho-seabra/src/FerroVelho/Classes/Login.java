package FerroVelho.Classes;

import FerroVelho.Dados.InterfaceLogin;

public class Login implements InterfaceLogin {
    private String email;
    private String usuario;
    private String senha;


    private boolean confirmado;

    //construtor da classe
    public Login(String email, String usuario, String senha){
        this.email= email;
        this.usuario=usuario;
        this.senha=senha;
        this.confirmado=false;
    }

    //Getters e Setters
    public String getUsuario(){return this.usuario;}
    public void setUsuario(String usuario){this.usuario=usuario;}
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email=email;}
    public String getSenha(){return this.senha;}
    public void setSenha(String senha){this.senha=senha;}
    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
//metodos
    //metodo pra confirmar as informações digitadas
    public void login() {
        //if email/usuario e senha equals (email/usuario, senha) de algum objeto usuario
        // puxar do repositorio ou algum array(?)
        this.setConfirmado(true);
    }

    //método da interface pra excluir os caracteres digitados.
    public void limpar() {}
    //
    public void logout(){}
}