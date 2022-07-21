import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private double valorTotal;

    private Item itemAtual;
    private List<Item> memento = new ArrayList<>();

    public Item getItemAtual() {
        return this.itemAtual;
    }

    public void setItemAtual(Item item) {
        this.itemAtual=item;
        this.memento.add(item);
    }

    public void restauraItem (int index) {
        if (index < 0 || index > this.memento.size()-1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.itemAtual = this.memento.get(index);
    }

    public List<Item> getItens () {
        return this.memento;
    }

}
