package FerroVelho.Classes;

import FerroVelho.Negocio.ControladorVenda;

import java.time.LocalDate;

public class Venda extends ControladorVenda {
    private int CodVenda;
    private LocalDate DataVenda;
    private float ValorTotal;
    private int QuanTotal;
    private boolean Finalizada;
    //private LISTA dos tipos de peças

    //construtor da classe->
    public Venda (int cd, LocalDate dtv, float vt, int qt){
        this.CodVenda= cd;
        this.DataVenda=dtv;
        this.ValorTotal=vt;
        this.QuanTotal= qt;
        this.Finalizada= false;

    }
    public int getCodVenda(){
        return this.CodVenda;
    }
    public void setCodVenda(int codVenda){
        this.CodVenda= codVenda;
    }
    public LocalDate getDataVenda(){
        return this.DataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        DataVenda = dataVenda;
    }
    public float getValorTotal(){
        return this.ValorTotal;
    }
    public void setValorTotal(float valorTotal){
        this.ValorTotal=valorTotal;
    }
    public int getQuanTotal(){
        return this.QuanTotal;
    }
    public void setQuanTotal(int quanTotal){
        this.QuanTotal= quanTotal;
    }
    public boolean isFinalizada() {
        return Finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        Finalizada = finalizada;
    }

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
