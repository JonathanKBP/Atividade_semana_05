
import java.util.ArrayList;
import java.util.List;


public class LancheDaTardeMenu implements Menu {
    
    private List<MenuItem> items = new ArrayList<>();
    private List<MenuItem> vege = new ArrayList<>();

    private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
        MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
        items.add(item);
        if(vegetariano ==  true){
            vege.add(item);
        }
    }

    public LancheDaTardeMenu() {
        addItem("Suco", "sabor: uva", true, 1.00);
        addItem("Lanche ", "Presunto e queijo", false, 2.99);
        addItem("Pão de queijo", "sem catupiry", true, 2.50);
    }

    @Override
    public Iterator createIterator() {
        return new LancheDaTardeIterator(this.items);
    }

    @Override
    public Iterator createIteratorVege() {
        return new LancheDaTardeIterator(this.vege);
    }
}
