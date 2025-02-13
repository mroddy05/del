import java.util.ArrayList;

public class Pizza {
	private PizzaCrust crust;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> toppingList;
	
	public Pizza() {
		this.crust = null;
		this.sauce = null;
		this.toppingList = new ArrayList<PizzaTopping>();
	}

	public PizzaCrust getCrust() {
		return this.crust;
	}

	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
	}

	public PizzaSauce getSauce() {
		return this.sauce;
	}

	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
	}

	public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}

	public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
	}
	
	public void display() {
		System.out.println(this.crust.toNiceString());
		System.out.println(this.sauce.toNiceString());
		for (PizzaTopping t : this.toppingList) {
			System.out.println(t.toNiceString());
		}
	}
}
