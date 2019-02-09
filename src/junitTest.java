import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import junit.framework.TestCase;

public class junitTest  {
	public junitTest() {
	CakeIterator iteratorCakeMenu =  new CakeMenu();
	CakeIterator iteratorCoffeeMenu= new CoffeeMenu();
	CakeIterator iteratorIceCreamMenu= new IceCreamMenu();
	
	Cashier cashier = new Cashier(iteratorCakeMenu,iteratorCoffeeMenu,iteratorIceCreamMenu);
	boolean cash = cashier.ShowTheOrder();
	Assert.assertTrue(cash);
	
	IceCreamMenu iceCream = new IceCreamMenu();
	boolean result= iceCream.addItem("chocolate", "choclote with chess", 25.49, 2000);
	Assert.assertTrue(result);
	
	CoffeeMenu coffee = new CoffeeMenu();
	boolean cof = coffee.addItem("chocolate", "choclote with chess", 25.49, 2000);
	Assert.assertTrue(cof);
	
	CakeMenu cake = new CakeMenu();
	boolean ca = coffee.addItem("chocolate", "choclote with chess", 25.49, 2000);
	Assert.assertTrue(ca);
	
	String name;
	String description;
	double price;
	double calories;
	CakeStoreMenu cakeStore = new CakeStoreMenu("chocolate", "choclote with chess", 25.49, 2000);
	
	
	}
	
	
}
