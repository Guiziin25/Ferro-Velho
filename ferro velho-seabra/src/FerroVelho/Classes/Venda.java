package FerroVelho.Classes;

import FerroVelho.Negocio.ControladorVenda;

import java.time.LocalDate;

public class Venda extends ControladorVenda {
    private static String CodVenda;
    private LocalDate DataVenda;
    private double ValorTotal;
    private int QuanTotal;
    private boolean Finalizada;
    //private LISTA dos tipos de peças

    //construtor da classe->
    public Venda (String codvenda, double valort, int quant, LocalDate datavenda){
        Venda.CodVenda= "#"+codvenda ;
        this.DataVenda= datavenda;
        this.ValorTotal=valort;
        this.QuanTotal= quant;
        this.Finalizada= false;

    }
    public String getCodVenda(){return CodVenda;}
    public void setCodVenda(String codVenda){this.CodVenda= "#"+codVenda;}
    public LocalDate getDataVenda(){return this.DataVenda;}
    public void setDataVenda(LocalDate dataVenda) {DataVenda = dataVenda;}
    public double getValorTotal(){return this.ValorTotal;}
    public void setValorTotal(double valorTotal){this.ValorTotal=valorTotal;}
    public int getQuanTotal(){return this.QuanTotal;}
    public void setQuanTotal(int quanTotal){this.QuanTotal= quanTotal;}
    public boolean isFinalizada() {return Finalizada;}
    public void setFinalizada(boolean finalizada) {Finalizada = finalizada;}
    // método pra teste na main
    public void infovenda(){
        System.out.println("as informações da venda são:");
        System.out.println("código:" + getCodVenda());
        System.out.printf("data" + getDataVenda());
        System.out.printf("ValorTotal:" + getValorTotal());
        System.out.printf("foi finalizada?:" + isFinalizada());}
    @Override
    public void calculaValorTotal() {

    }

    @Override
    public void FinalizaVenda() {setFinalizada(true);

    }

    @Override
    public void ImprimeLista() {

    }

    @Override
    public void CalculaQuantidade() {

    }
}
