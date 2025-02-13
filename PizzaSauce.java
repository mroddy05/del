public abstract class PizzaSauce {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Sauce: " + this.toString();
	}
	
}
