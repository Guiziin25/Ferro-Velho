package FerroVelho.Classes;

public class ItemVenda {
    private int quantidade;

    private Peca Item;

    private void inserirItem() {
    };

    //construtor
    public ItemVenda(Peca item, int quanti){
        this.Item= item;
        this.quantidade= quanti;
    }

    //getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Peca getItem() {return Item;}
    public void setItem(Peca item){this.Item=item;}
}
