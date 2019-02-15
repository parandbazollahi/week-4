import java.util.Iterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;
public class Cashier {
	Menu  cakeMenu;
	Menu  coffeeMenu;
	Menu  iceCreamMenu;
	
	public Cashier(Menu cakeMenu , Menu coffeeMenu , Menu iceCreamMenu) {
		this.cakeMenu = cakeMenu;
		this.coffeeMenu = coffeeMenu;
		this.iceCreamMenu = iceCreamMenu;
	}
	
	
	public boolean printMenu() {
		CakeIterator cakeMenuIterator = cakeMenu.createIterator();
		CakeIterator coffeeMenuIterator =  coffeeMenu.createIterator();
		CakeIterator iceCreamMenuIterator =  iceCreamMenu.createIterator();

		System.out.println("MENU\n----\nCake");
		printMenu(cakeMenuIterator);
		System.out.println("\nCoffee");
		printMenu(coffeeMenuIterator);
		System.out.println("\nIceCream");
		printMenu(iceCreamMenuIterator);
		return true;
	}
 
	private boolean printMenu(CakeIterator iterator) {
		while (iterator.hasNext()) {
			CakeStoreMenu menuItem = (CakeStoreMenu) iterator.next();
			System.out.print(menuItem.getName() + " , ");
			System.out.print(menuItem.getDescription() +", ");
			System.out.println(menuItem.getPrice() +"&, ");
			System.out.println(menuItem.getCalories() +" Calories");
			
		}
		return true;
	}
	
}
