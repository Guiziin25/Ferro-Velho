package FerroVelho.Dados;

import java.util.ArrayList;
import java.util.List;

import FerroVelho.Classes.Venda;

class RepositorioVenda {
    private List<Venda> vendas;
    private int proximoId;

    public RepositorioVenda() {
        this.vendas = new ArrayList<>();
        this.proximoId = 1;
    }

    // Adicionar venda ao repositório
    public void adicionarVenda(Venda venda) {
        venda.setCodVenda(proximoId++);
        vendas.add(venda);
    }

    // Remover venda do repositório
    public void removerVenda(int id) {
        vendas.removeIf(v -> v.getCodVenda() == id);
    }

    // Obter todas as vendas do repositório
    public List<Venda> obterTodasVendas() {
        return new ArrayList<>(vendas);
    }

    // Obter venda por ID
    public Venda obterVendaPorId(int id) {
        for (Venda venda : vendas) {
            if (venda.getCodVenda() == id) {
                return venda;
            }
        }
        return null; // Retorna null se a venda não for encontrada
    }
}