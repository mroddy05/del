public class ThickCrust extends PizzaCrust {
	private Boolean isDeepDish;
	
	@Override
	public String toString() {
		return "Thick Crust ";
	}

	@Override
	public String toNiceString() {
		return super.toNiceString() + (this.getIsDeepDish()? "(Deep Dish)" : "");
	}

	@Override
	public String checkIntegrity() {
		return this.ingredient.equalsIgnoreCase("Cauliflower")? 
				"Handle carefully: crust might fall apart" : 
				super.checkIntegrity();
	}
	
	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}
	
	public void setIsDeepDish(Boolean isDeepDish) {
		this.isDeepDish = isDeepDish;
	}
}
