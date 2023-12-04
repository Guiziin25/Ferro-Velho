package FerroVelho.Classes;

public class ItemVenda {
    private int quantidade;

    private Peca Item;



    private double ValorConjunto;
    private void calculavc(){
        double total= this.getQuantidade() * Item.getPreco();
        this.setValorConjunto(total);
    }

    public void inserirItem() {
    };
    //metodo pra teste na main
    public void mostraritemvenda(){
        System.out.println("quantidade"+getQuantidade());
        System.out.println("Peça:" + getItem());
    }

    //construtor
    public ItemVenda(Peca item, int quanti){
        this.Item= item;
        this.quantidade= quanti;

    }

    //getters e setters
    public double getValorConjunto() {
        return ValorConjunto;
    }

    public void setValorConjunto(double valorConjunto) {
        ValorConjunto = valorConjunto;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Peca getItem() {return Item;}
    public void setItem(Peca item){this.Item=item;}
}
