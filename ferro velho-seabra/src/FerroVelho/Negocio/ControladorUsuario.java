package FerroVelho.Negocio;

import java.util.List;

import FerroVelho.Classes.Usuario;
import FerroVelho.Classes.UsuarioNormal;
import FerroVelho.Classes.UsuarioAdmin;
import FerroVelho.Dados.RepositorioUsuario;

public class ControladorUsuario {
    private RepositorioUsuario repositorioUsuario;

    public ControladorUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    // Método para registrar um novo usuário
    public void registrarUsuarioNormal(String nome, String email, String login, String senha, int id) {
        Usuario novoUsuario = new UsuarioNormal(nome, email, login, senha,id);
        repositorioUsuario.adicionarUsuario(novoUsuario);
        System.out.println("Usuário registrado com sucesso!");
    }

        public void registrarUsuarioAdmin(String nome, String email, String login, String senha, int id) {
        Usuario novoUsuario = new UsuarioAdmin(nome, email, login, senha, id);
        repositorioUsuario.adicionarUsuario(novoUsuario);
        System.out.println("Usuário registrado com sucesso!");
    }

    // Método para autenticar um usuário
    public Usuario autenticarUsuario(String login, String senha) {
        return repositorioUsuario.autenticarUsuario(login, senha);
    }

    // Outros métodos relacionados ao gerenciamento de usuários
    // ...

    // Exemplo de método para obter todos os usuários (apenas para ilustração)
    public List<Usuario> obterTodosUsuarios() {
        return repositorioUsuario.obterTodosUsuarios();
    }
}
