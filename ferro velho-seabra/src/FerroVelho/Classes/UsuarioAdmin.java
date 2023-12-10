package FerroVelho.Classes;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String login, String cpf, String email, String nome, String senha, int id) {
        super(login, cpf, email, nome, senha, id);
    }

    //metodos de Vendedor
    public void anunciarPeca() {
    }

    ;

    public void finalizavenda() {
    }

    @Override
    public String getTipoUsuario() {
        return "Admin";
    }
}