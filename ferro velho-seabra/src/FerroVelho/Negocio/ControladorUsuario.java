package FerroVelho.Negocio;

import java.util.ArrayList;
import java.util.List;

import FerroVelho.Classes.EnumTipoUser;
import FerroVelho.Classes.Usuario;
import FerroVelho.Dados.InterfaceRepositorioGenerico;
import FerroVelho.Dados.RepositorioGenerico;

public class ControladorUsuario {
     private InterfaceRepositorioGenerico<Usuario> repositorioUsuarios;
    
    private static ControladorUsuario instancia;

    private ControladorUsuario() {
        this.repositorioUsuarios = new RepositorioGenerico<>("usuarios.dat");
    }
    
    public static ControladorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ControladorUsuario();
        }
        return instancia;
    }

    public boolean login(String login, String senha) {
        List<Usuario> usuarios = this.listarUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                if (usuario.getSenha().equals(senha)) {
                    GerenciadorSessao.getInstancia().abrirSessao(usuario);
                }
            }           
        }
        return true;
    }

    public void logoff() {
        GerenciadorSessao.getInstancia().encerrarSessao();
    }

    public Usuario getUsuario() {
        return instancia.getUsuario();
    }

    public void adicionarUsuario(Usuario usuario) {
        repositorioUsuarios.adicionar(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repositorioUsuarios.listar();
    }

    public void removerUsuario(Usuario usuario) {
        repositorioUsuarios.remover(usuario);
    }

    public void editarUsuario(Usuario usuario, Usuario novo) {
        repositorioUsuarios.editar(usuario, novo);
    }

    public List<Usuario> buscarUsuario(Object T) {
        List<Usuario> resultados = new ArrayList<>();
        List<Usuario> usuarios = this.listarUsuarios();
        if (T instanceof String) {
            String palavra = (String) T;
            if (palavra.isBlank()) {
                return usuarios;
            }
            else {
                for (Usuario usuario : usuarios) {
                    String[] palavras = usuario.getNome().split("\\s+");
                    for (String p : palavras) {
                        if(p.equalsIgnoreCase(palavra)) {
                            resultados.add(usuario);
                            break;
                        }
                    }
                }
                return resultados;
            }
        }
        else if (T instanceof EnumTipoUser) {
            EnumTipoUser tipo = (EnumTipoUser) T;
            for (Usuario usuario : usuarios) {
                if (usuario.getTipo().equals(tipo)) {
                    resultados.add(usuario);
                }
            }
            return resultados;
        }
     return resultados;
    }
    
    public Usuario buscarUmUsuario(String login) {
        List<Usuario> usuarios = this.listarUsuarios();
       for(Usuario f: usuarios) {
    	   if(f.getLogin() == login) {
    		   return f;
    	   }
        }
       return null;
    }

    public void adicionarLista(List lista) {
        GerenciadorSessao.getInstancia().getUsuarioOnline().adicionarLista(lista);
    }
    public void removerLista(List lista) {
        GerenciadorSessao.getInstancia().getUsuarioOnline().removerLista(lista);
    }

}
