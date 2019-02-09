import java.util.Iterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;
public class Cashier {
	CakeMenu cakeMenu;
	CoffeeMenu coffeeMenu;
	IceCreamMenu iceCreamMenu;
	
	CakeIterator iteratorCakeMenu;
	CakeIterator iteratorCoffeeMenu;
	CakeIterator iteratorIceCreamMenu;
	
	public Cashier(CakeIterator newCakeMenu , CakeIterator newCoffeeMenu , CakeIterator newIceCreamMenu) {
		iteratorCakeMenu =  newCakeMenu;
		iteratorCoffeeMenu = newCoffeeMenu;
		iteratorIceCreamMenu = newIceCreamMenu;
	}
	public boolean ShowTheOrder() {
		ArrayList cakeOrder = cakeMenu.GetOrder();
		System.out.println("order Cake in the cake menu\n");
		for( int i = 0 ;i < cakeOrder.size();i++) {
		CakeStoreMenu MenuItem = (CakeStoreMenu) cakeOrder.get(i);
				System.out.println(MenuItem.getName());
				System.out.println(MenuItem.getDescription());
				System.out.println(MenuItem.getPrice()+ "&" + "\n");
				System.out.println(MenuItem.getCalories() + "Calories" + "\n");
		}
		CakeStoreMenu[] coffeeOrder = coffeeMenu.getOrder();
		System.out.println("order coffee in the coffee menu\n");
		for( int i = 0 ;i < coffeeOrder.length;i++) {
		CakeStoreMenu MenuItem = coffeeOrder[i];
				System.out.println(MenuItem.getName());
				System.out.println(MenuItem.getDescription());
				System.out.println(MenuItem.getPrice());
				System.out.println(MenuItem.getCalories());
		}
		Hashtable <Integer ,CakeStoreMenu > iceCreamOrder = iceCreamMenu.GetOrder();
		System.out.println("order Ice Cream in the ICE Cream menu\n");
		for( Enumeration <Integer> e =iceCreamOrder.keys() ; e.hasMoreElements();) {
		CakeStoreMenu MenuItem = iceCreamOrder.get(e.nextElement());
				System.out.println(MenuItem.getName());
				System.out.println(MenuItem.getDescription());
				System.out.println(MenuItem.getPrice()+ "&" + "\n");
				System.out.println(MenuItem.getCalories()+ "Calories" );
		}
		return true;
	}
	
	public void showTheBill(){
		       
		        Iterator CakeMenu = iteratorCakeMenu.createIterator();
		        Iterator CoffeeMenu = iteratorCoffeeMenu.createIterator();
		        Iterator IceCreamMenu = iteratorIceCreamMenu.createIterator();
		        
		        System.out.println("#list of the Cake Menu "+"\n");
		        printTheBills(CakeMenu);
		        System.out.println("#list of the Coffee Menu " + "\n");
		        printTheBills(CoffeeMenu);
		        System.out.println("#list of the Ice Cream Menu"+"\n");
		        printTheBills(IceCreamMenu);
	}
		    public void printTheBills(Iterator iterator){
		        while(iterator.hasNext()){
		        	CakeStoreMenu cakeStoreMenu = (CakeStoreMenu) iterator.next();
		            System.out.println(cakeStoreMenu.getName());
		            System.out.println(cakeStoreMenu.getDescription());
		            System.out.println(cakeStoreMenu.getPrice()+ " &");
		            System.out.println(cakeStoreMenu.getCalories() + " Calories" +"\n");
		             
		        }
		    }
}
