package luqmanmohammad.U2D3SpringBoot.entities.toppings;

import luqmanmohammad.U2D3SpringBoot.entities.Consummation;


public class OnionTopping extends ToppingDecorator {

	public OnionTopping(Consummation c) {
		super(c);
		this.name = "Cipolla";
		this.price = 1.00;
		this.calories = 100;
	}
}