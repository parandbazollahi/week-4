
import java.util.Hashtable;
import java.util.Iterator;


public class IceCreamMenu implements CakeIterator{
	Hashtable <Integer, CakeStoreMenu> MenuItem = new Hashtable <Integer, CakeStoreMenu>();
	int hashKey = 0 ;
	public IceCreamMenu() {
	
	addItem("Sea Salt Caramel IceCream","Vanilla ice cream, sea salt, caramel sauce and handmade hot fudge topped with whipped cream",11.99,1130);
	addItem("Banana Split IceCream","Vanilla, Strawberry and Chocolate ice cream topped with crushed pineapple, strawberry topping ",12.45,1160);
	addItem("Cookie IceCream","Vanilla and Cookies 'n Cream ice cream, handmade hot fudge topped with whipped cream, ", 10.75,1610);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu cakeStoreMenu= new CakeStoreMenu(name, description, price, calories);
		MenuItem.put(hashKey,cakeStoreMenu);
		hashKey ++;
		return true;
	}
	public Hashtable <Integer, CakeStoreMenu> GetOrder() {
		return MenuItem;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return MenuItem.values().iterator();
	}
}	
