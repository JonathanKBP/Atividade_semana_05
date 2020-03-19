
public class DinerMenuIterator<T> implements Iterator<T> {

    private MenuItem[] items;
    private int contador = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return contador < this.items.length && this.items[contador] != null;
    }

    @Override
    public <T> Object next() {
        return this.items[this.contador++];
    }
}
