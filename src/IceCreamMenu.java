
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class IceCreamMenu implements Menu{
	ArrayList<CakeStoreMenu> menuItems;
	
	public IceCreamMenu() {
		menuItems = new ArrayList<CakeStoreMenu>();
	addItem("Sea Salt Caramel IceCream","Vanilla ice cream, sea salt, caramel sauce and handmade hot fudge topped with whipped cream",11.99,1130);
	addItem("Banana Split IceCream","Vanilla, Strawberry and Chocolate ice cream topped with crushed pineapple, strawberry topping ",12.45,1160);
	addItem("Cookie IceCream","Vanilla and Cookies 'n Cream ice cream, handmade hot fudge topped with whipped cream, ", 10.75,1610);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu icecream= new CakeStoreMenu(name, description, price, calories);
		menuItems.add(icecream);
		return true;
	}
	public ArrayList<CakeStoreMenu> getOrder() {
		return menuItems;
	}
	public CakeIterator createIterator() {
		return new IceCreamMenuIterator(menuItems);
	}
	public String toString() {
		return "Objectville icecream Menu";
	}
}

