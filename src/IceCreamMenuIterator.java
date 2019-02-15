
import java.util.ArrayList;

public class IceCreamMenuIterator implements CakeIterator {
	ArrayList<CakeStoreMenu> items;
	int position = 0;
 
	public IceCreamMenuIterator(ArrayList<CakeStoreMenu> items) {
		this.items = items;
	}
 
	public CakeStoreMenu next() {
		CakeStoreMenu item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}