
public class ArrayIterator implements CakeIterator {
	CakeStoreMenu[] items;
	int position = 0;
 
	public ArrayIterator(CakeStoreMenu[] items) {
		this.items = items;
	}
 
	public CakeStoreMenu next() {
		CakeStoreMenu menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}