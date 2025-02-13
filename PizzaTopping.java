public abstract class PizzaTopping {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Topping: " + this.toString();
	}

}
