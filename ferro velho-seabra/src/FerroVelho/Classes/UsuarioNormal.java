package FerroVelho.Classes;

public class UsuarioNormal extends Usuario {
    public UsuarioNormal(String nome, String email, String login, String senha) {
        super(nome, email, login, senha);
    }

    @Override
    public String getTipoUsuario() {
        return "Normal";
    }
}