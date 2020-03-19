
public class DinerMenu implements Menu {

    private MenuItem[] items = new MenuItem[6];
    private MenuItem[] vege = new MenuItem[6];
    private int quantidade = 0;

    public void addItem(String nome, String descricao, boolean vegetariano, double preco) {
        MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
        items[quantidade++] = item;
        if(vegetariano == true){
            vege[quantidade++] = item;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this.items);
    }

    public DinerMenu() {
        addItem("Bacon", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soap of the day","Soap of the day, with a side of potato-salad", false, 3.29);
        addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false, 3.05);
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    }

    /*public MenuItem[] getItems() {
		return items;
	}*/

    @Override
    public Iterator createIteratorVege() {
        return new DinerMenuIterator(this.vege);
    }
}
