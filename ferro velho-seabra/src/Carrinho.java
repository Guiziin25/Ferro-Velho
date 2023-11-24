import java.util.ArrayList;
import java.util.List;

//Atributos e declaração
public class Carrinho {
    private List<Peca> carrinhoDeCompras;

    //Construtor
    public Carrinho(){
        this.carrinhoDeCompras = new ArrayList<>();
    }


    //Métodos
    public void addItem(Peca item){
        carrinhoDeCompras.add(item);
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Peca peca : carrinhoDeCompras){
            total += peca.getPreco();
        }
        return total;
        }


    public double calcularPrecoTotal() {
        return 0;
    }
}
