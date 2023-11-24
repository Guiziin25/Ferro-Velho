package FerroVelho.Dados;

import java.util.List;

public interface InterfaceRepositorioGenerico<T> {

    void adicionar(T objeto);

    List<T> listar();

    void remover(T objeto);

    void editar(T objeto, T novo);

}