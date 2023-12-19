package FerroVelho.Negocio;

import java.time.LocalDate;
import java.util.List;

import FerroVelho.Classes.EnumAutomovel;
import FerroVelho.Classes.EnumQualidade;
import FerroVelho.Classes.EnumTipo;
import FerroVelho.Classes.Peca;
import FerroVelho.Dados.RepositorioPeca;

public abstract class ControladorPeca {
    private RepositorioPeca repositorioPeca;

    public ControladorPeca(RepositorioPeca repositorioPeca) {
        this.repositorioPeca = repositorioPeca;
    }

    // Método para registrar uma nova Peça
    public void adicionarPeca(String nome, LocalDate data, String descricao, EnumTipo tipo, EnumQualidade qualidade, EnumAutomovel automovel, Double preco) {
        Peca novaPeca = new Peca(nome, data, descricao, tipo, qualidade, automovel, preco);
        repositorioPeca.adicionarPeca(novaPeca);
        System.out.println("Peça registrada com sucesso!");
    }
    
    //Método para remover Peças
    public void RemoverPeca(int id) {;
         repositorioPeca.removerPeca(id); 
    }

    //Método para listar todas as Peças
    public void listarTodasPeças() {
        List<Peca> peças = repositorioPeca.obterTodasPecas();
        for (Peca peça : peças) {
            System.out.println("ID: " + peça.getId() + ", Nome: " + peça.getNome());
        }
    }
}
