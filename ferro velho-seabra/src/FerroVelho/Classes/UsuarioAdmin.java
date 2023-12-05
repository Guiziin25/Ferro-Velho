package FerroVelho.Classes;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nome, String email, String login, String senha) {
        super(nome, email, login, senha);
    }

    @Override
    public String getTipoUsuario() {
        return "Admin";
    }
}