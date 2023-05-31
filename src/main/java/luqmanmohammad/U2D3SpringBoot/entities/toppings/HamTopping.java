package luqmanmohammad.U2D3SpringBoot.entities.toppings;

import luqmanmohammad.U2D3SpringBoot.entities.Consummation;

public class HamTopping extends ToppingDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}