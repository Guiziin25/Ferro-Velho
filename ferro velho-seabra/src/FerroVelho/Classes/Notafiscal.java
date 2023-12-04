package FerroVelho.Classes;

import java.time.LocalDate;

public class Notafiscal {
    private static String CodVenda;
    private LocalDate DataVenda;
    private Carrinho Compra;
    private Usuario Cliente;

    //private LISTA dos tipos de peças

    //construtor da classe->
    public Notafiscal (String codvenda,Usuario cliente, LocalDate datavenda){
        CodVenda= "#"+codvenda ;
        this.DataVenda= datavenda;
        this.Cliente= cliente;

    }
    //getters e setters
    public String getCodVenda(){return this.CodVenda;}
    public void setCodVenda(String codVenda){this.CodVenda= "#"+codVenda;}
    public LocalDate getDataVenda(){return this.DataVenda;}
    public void setDataVenda(LocalDate dataVenda) {this.DataVenda = dataVenda;}



    // método pra teste na main
    public void infovenda(){
        System.out.println("as informações da venda são:");
        System.out.println("código:" + getCodVenda());
        System.out.printf("data" + getDataVenda());
        System.out.printf("ValorTotal:" + Compra.getValorTotal());
        System.out.printf("foi finalizada?:" + Compra.isFinalizada());}

    //mais metodos haha
    public void ImprimeLista(){};

    }
