
public class CakeStoreMenu {
	String name;
	String description;
	double price;
	double calories;


	public CakeStoreMenu (String name,String description ,double price, double calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.description= description;
		}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public double getPrice(){
		return price;
	}
	public double getCalories(){
		return calories;
	}
	
}