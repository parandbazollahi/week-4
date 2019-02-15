
	import java.util.*;

	public class test {
		public static void main(String args[]) {
			CakeMenu cakeMenu = new CakeMenu();
	        CoffeeMenu coffeeMenu = new CoffeeMenu();
	        IceCreamMenu icecreamMenu = new IceCreamMenu();
	        
	 
			Cashier cashier = new Cashier(cakeMenu, coffeeMenu,icecreamMenu);
			// With iterators
			cashier.printMenu();
			
		}
		
}