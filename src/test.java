
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsysrem
		CakeMenu cakeMenu = new CakeMenu ();
		CoffeeMenu coffeeMenu = new CoffeeMenu();
		IceCreamMenu iceCreamMenu = new IceCreamMenu();
		Cashier cashier = new Cashier(cakeMenu , coffeeMenu , iceCreamMenu );
		cashier .showTheBill();
	}
}
