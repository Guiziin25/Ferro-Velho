package FerroVelho.Classes;
import FerroVelho.Negocio.ControladorVenda;

import java.util.ArrayList;
import java.util.List;

//Atributos e declaração
public class Carrinho{
    private UsuarioNormal Dono;
    private List<ItemVenda> carrinhoDeCompras;
    private double ValorTotal;
    private int QuanTotal;
    private boolean Finalizada;

    //Construtor
    public Carrinho(List<ItemVenda> carrinhoDeCompras, Double valorTotal, int quanTotal){
        this.carrinhoDeCompras = new ArrayList<>();
        this.ValorTotal = valorTotal;
        this.QuanTotal= quanTotal;
    }

    //getters e setters
    public UsuarioNormal getDono() {return Dono;}

    public void setDono(UsuarioNormal dono) {Dono = dono;}
    public double getValorTotal(){return this.ValorTotal;}
    public void setValorTotal(double valorTotal){this.ValorTotal=valorTotal;}
    public int getQuanTotal(){return this.QuanTotal;}
    public void setQuanTotal(int quanTotal){this.QuanTotal= quanTotal;}
    public boolean isFinalizada() {return Finalizada;}
    public void setFinalizada(boolean finalizada) {Finalizada = finalizada;}


    //Métodos
    public void addItem(ItemVenda item){
        this.carrinhoDeCompras.add(item);
    }

    public void calcularTotal(){
        double vtotal = 0.0;
        for (ItemVenda item : carrinhoDeCompras){
            vtotal += item.getValorConjunto();
        }
        setValorTotal(vtotal);
        }


    public void calculaQuantidadeTotal() {
        int quantidadetotal= 0;
        for (ItemVenda item : carrinhoDeCompras){
            quantidadetotal+= item.getQuantidade();}
        this.setQuanTotal(quantidadetotal);
    }


}
