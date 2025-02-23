public abstract class PizzaCrust {
	protected String ingredient;
	
	public PizzaCrust() {
		this.ingredient = "";
	}
	
	public abstract String toString(); 

	public String toNiceString() {
		return "Crust: " + this.toString() + "(" + this.ingredient + ")";
	}
	
	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String checkIntegrity() { 
		return "";
	}
}
