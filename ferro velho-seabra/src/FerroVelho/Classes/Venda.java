package FerroVelho.Classes;

import java.time.LocalDate;

public class Venda {
    private String CodVenda;
    private LocalDate DataVenda;
    private Carrinho Compra;
    private UsuarioNormal Cliente;
    private UsuarioAdmin Funcionario;

    //private LISTA dos tipos de peças

    //construtor da classe->
    public Venda (String codvenda,UsuarioNormal cliente, Carrinho compra,LocalDate datavenda, UsuarioAdmin funcionario ){
        this.CodVenda= "#"+codvenda ;
        this.DataVenda= datavenda;
        this.Cliente= cliente;
        this.Compra= compra;
        this.Funcionario= funcionario;

    }
    //getters e setters
    public String getCodVenda(){return CodVenda;}
    public void setCodVenda(String codVenda){this.CodVenda= "#"+codVenda;}
    public LocalDate getDataVenda(){return DataVenda;}
    public void setDataVenda(LocalDate dataVenda) {this.DataVenda = dataVenda;}
    public Carrinho getCompra() {return Compra;}

    public void setCompra(Carrinho compra) {this.Compra = compra;}

    public UsuarioNormal getCliente() {return Cliente;}

    public void setCliente(UsuarioNormal cliente) {this.Cliente = cliente;}

    public UsuarioAdmin getFuncionario() {return Funcionario;}

    public void setFuncionario(UsuarioAdmin funcionario) {this.Funcionario = funcionario;}



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
