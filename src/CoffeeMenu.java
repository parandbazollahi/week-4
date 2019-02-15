import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class CoffeeMenu implements Menu {
	ArrayList<CakeStoreMenu> menuItems;
	
	public CoffeeMenu() {
		menuItems = new ArrayList<CakeStoreMenu>();
	
	addItem("coffee","Made from Arabica beans, is freshly ground and brewed continually",2.99,300);
	addItem("Macchiato","Made with creamy milk and topped with two shots of espresso",3.79,500);
	addItem("Latte","Made with steamed, frothy milk, blended with freshly ground and brewed espresso", 5.99,750);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu coffee= new CakeStoreMenu(name, description, price, calories);
		menuItems.add(coffee);
		return true;
	}
	
	public ArrayList<CakeStoreMenu> getOrder() {
		return menuItems;
	}
	public CakeIterator createIterator() {
		return new coffeeMenuIterator(menuItems);
	}
	public String toString() {
		return "Objectville coffee Menu";
	}
}
