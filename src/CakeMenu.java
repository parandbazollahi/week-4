import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;


public class CakeMenu implements CakeIterator {
	ArrayList <CakeStoreMenu> MenuItem ;
	
	public CakeMenu() {
		MenuItem = new ArrayList<CakeStoreMenu>();
	
	addItem("CheeseCake","chess  fresh cheese with crushed cookies",10.99,1200);
	addItem("ChocolateCake","chocolate cake filled with three layers of fresh strawberry",13.79,2000);
	addItem("Vanilla Almond","filled and frosted with vanilla buttercream" , 14.49,1800);
	}
	public boolean addItem (String name,String description ,double price, double calories ) {
		CakeStoreMenu cakeStoreMenu= new CakeStoreMenu(name, description, price, calories);
		MenuItem.add(cakeStoreMenu);
		return true;
	}
	
	public ArrayList<CakeStoreMenu> GetOrder() {
		return MenuItem;
	}
	public Iterator createIterator() {
		return MenuItem.iterator();
	}
}
