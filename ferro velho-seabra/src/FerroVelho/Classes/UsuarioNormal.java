package FerroVelho.Classes;

public class UsuarioNormal extends Usuario{
    public UsuarioNormal(String login,String cpf, String email, String nome, String senha, int id) {
        super(login,cpf, email, nome, senha, id);
    }
    //metodos de cliente
    public void AdicionarItem(){}
    public void Pagar(){}


    @Override
    public String getTipoUsuario() {
        return "Normal";
    }

}
