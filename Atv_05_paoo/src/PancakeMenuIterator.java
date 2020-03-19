
import java.util.List;

public class PancakeMenuIterator<T> implements Iterator<T> {

    private List<MenuItem> items;
    private int contador = 0;

    public PancakeMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return contador < items.size() && items.get(contador) != null;
    }

    @Override
    public <T> Object next() {
        return items.get(contador++);
    }

}
