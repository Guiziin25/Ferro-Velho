package FerroVelho.Dados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<T> implements InterfaceRepositorioGenerico<T> {

     private List<T> lista;
    public String arquivo;
    
    public RepositorioGenerico(String nome) {
        this.lista = new ArrayList<>();

        Object arquivoRepositorio = RepositorioArquivos.ler(nome);
        if (arquivoRepositorio instanceof List<?> && arquivoRepositorio != null) {
            this.lista = (List<T>) arquivoRepositorio;
        }
    }

   
    @Override
    public void adicionar(T objeto) {
        if (!this.lista.contains(objeto)) {
            this.lista.add(objeto);
        }
        RepositorioArquivos.salvar(lista, arquivo);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    @Override
    public void remover(T objeto) {
        if (this.lista.contains(objeto)) {
            lista.remove(this.lista.indexOf(objeto));
        }
        RepositorioArquivos.salvar(lista, arquivo);
    }

    @Override
    public void editar(T objeto, T novo) {
        if (this.lista.contains(objeto)) {
            int i = this.lista.indexOf(objeto);
            this.lista.set(i, novo);
        }
        RepositorioArquivos.salvar(lista, arquivo);
    }
}
