package FerroVelho.Dados;

import java.util.ArrayList;
import java.util.List;

import FerroVelho.Classes.Usuario;

public class RepositorioUsuario {
    private List<Usuario> usuarios;
    private int proximoId;

    public RepositorioUsuario() {
        this.usuarios = new ArrayList<>();
        this.proximoId = 1;
    }

    // Adicionar usuário ao repositório
    public void adicionarUsuario(Usuario usuario) {
        usuario.setId(proximoId++);
        usuarios.add(usuario);
    }

    // Remover usuário do repositório
    public void removerUsuario(int id) {
        usuarios.removeIf(u -> u.getId() == id);
    }

    // Obter todos os usuários do repositório
    public List<Usuario> obterTodosUsuarios() {
        return new ArrayList<>(usuarios);
    }

    // Obter usuário por ID
    public Usuario obterUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Método para autenticar usuário com login/senha
    public Usuario autenticarUsuario(String login, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null; // Retorna null se a combinação de login/senha não for encontrada
    }
}
