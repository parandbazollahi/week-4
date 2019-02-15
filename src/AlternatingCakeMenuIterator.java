
import java.util.Calendar;

public class AlternatingCakeMenuIterator implements CakeIterator {
	CakeStoreMenu[] list;
	int position;

	public void AlternatingDinerMenuIterator(CakeStoreMenu[] list) {
		this.list = list;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public CakeStoreMenu next() {
		CakeStoreMenu menuItem = list[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Cake Menu Iterator";
	}
}