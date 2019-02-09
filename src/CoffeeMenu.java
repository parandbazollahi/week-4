import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class CoffeeMenu implements CakeIterator {
	CakeStoreMenu [] MenuItem;
	int arrayValue = 0 ;
	
	public CoffeeMenu() {
		MenuItem = new CakeStoreMenu[3];
	
	addItem("coffee","Made from Arabica beans, is freshly ground and brewed continually",2.99,300);
	addItem("Macchiato","Made with creamy milk and topped with two shots of espresso",3.79,500);
	addItem("Latte","Made with steamed, frothy milk, blended with freshly ground and brewed espresso", 5.99,750);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu coffee= new CakeStoreMenu(name, description, price, calories);
		MenuItem[arrayValue] = coffee;
		arrayValue ++;
		return true;
	}
	public CakeStoreMenu[] getOrder() {
		return MenuItem;
	}
	public Iterator createIterator() {
        return Arrays.asList(MenuItem).iterator();
	}

}
