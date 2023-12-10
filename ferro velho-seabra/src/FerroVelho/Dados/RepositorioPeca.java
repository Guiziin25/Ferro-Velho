package FerroVelho.Dados;

import java.util.ArrayList;
import java.util.List;

import FerroVelho.Classes.Peca;

public class RepositorioPeca {
    private List<Peca> pecas;
    private int proximoId;

    public RepositorioPeca() {
        this.pecas = new ArrayList<>();
        this.proximoId = 1;
    }

    // Adicionar peça ao repositório
    public void adicionarPeca(Peca peca) {
        peca.setId(proximoId++);
        pecas.add(peca);
    }

    // Remover peça do repositório
    public void removerPeca(int id) {
        pecas.removeIf(p -> p.getId() == id);
    }

    // Obter todas as peças do repositório
    public List<Peca> obterTodasPecas() {
        return new ArrayList<>(pecas);
    }

    // Obter peça por ID
    public Peca obterPecaPorId(int id) {
        for (Peca peca : pecas) {
            if (peca.getId() == id) {
                return peca;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }
}
