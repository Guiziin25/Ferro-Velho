import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Peca> carrinhoDeCompras;
    public Carrinho(){ //construtor
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
    }
}
