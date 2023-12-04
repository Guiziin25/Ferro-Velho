package FerroVelho.Classes;

import FerroVelho.Negocio.ControladorVenda;

import java.time.LocalDate;

public class Venda {
    private static String CodVenda;
    private LocalDate DataVenda;
    private Carrinho Compra;
    private final Usuario Cliente;
    private boolean Finalizada;
    //private LISTA dos tipos de peças

    //construtor da classe->
    public Venda (String codvenda,Usuario cliente, LocalDate datavenda){
        Venda.CodVenda= "#"+codvenda ;
        this.DataVenda= datavenda;
        this.Cliente= cliente;
        this.Finalizada= false;

    }
    //getters e setters
    public String getCodVenda(){return CodVenda;}
    public void setCodVenda(String codVenda){this.CodVenda= "#"+codVenda;}
    public LocalDate getDataVenda(){return this.DataVenda;}
    public void setDataVenda(LocalDate dataVenda) {DataVenda = dataVenda;}

    public boolean isFinalizada() {return Finalizada;}
    public void setFinalizada(boolean finalizada) {Finalizada = finalizada;}

    // método pra teste na main
    public void infovenda(){
        System.out.println("as informações da venda são:");
        System.out.println("código:" + getCodVenda());
        System.out.printf("data" + getDataVenda());
        System.out.printf("ValorTotal:" + Compra.getValorTotal());
        System.out.printf("foi finalizada?:" + isFinalizada());}

    //mais metodos haha
    public void FinalizaVenda() {setFinalizada(true);
    public void ImprimeLista(){};

    }


}
