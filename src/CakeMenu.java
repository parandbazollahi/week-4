import java.util.ArrayList;
import java.util.Iterator;

public class CakeMenu implements Menu {
	static final int MAX_ITEMS = 3;
	int numberOfItems = 0;
	CakeStoreMenu[] menuItems;
  
	
	public CakeMenu() {
		menuItems = new CakeStoreMenu[MAX_ITEMS];
	
	addItem("CheeseCake"," fresh cheese with crushed cookies",10.99,1200);
	addItem("ChocolateCake","chocolate cake filled with three layers of fresh strawberry",13.79,2000);
	addItem("Vanilla Almond","filled and frosted with vanilla buttercream" , 14.49,1800);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu cakeStoreMenu= new CakeStoreMenu(name, description, price, calories);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = cakeStoreMenu;
			numberOfItems = numberOfItems + 1;
		}
		return true;
	}
	
	public  CakeStoreMenu[] getMenuItems() {
		return menuItems;
	}
	public CakeIterator createIterator() {
		return new CakeMenuIterator(menuItems);
	}
}
