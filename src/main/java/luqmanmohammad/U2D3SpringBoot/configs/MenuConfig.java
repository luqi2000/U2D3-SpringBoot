package luqmanmohammad.U2D3SpringBoot.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import luqmanmohammad.U2D3SpringBoot.entities.Consummation;
import luqmanmohammad.U2D3SpringBoot.entities.Menu;
import luqmanmohammad.U2D3SpringBoot.entities.drinks.Coke;
import luqmanmohammad.U2D3SpringBoot.entities.drinks.Lemonade;
import luqmanmohammad.U2D3SpringBoot.entities.pizzas.Pizza;
import luqmanmohammad.U2D3SpringBoot.entities.toppings.HamTopping;
import luqmanmohammad.U2D3SpringBoot.entities.toppings.OnionTopping;

@Configuration
public class MenuConfig {
	@Bean
	Menu getMenu() {
		Menu menu = new Menu();

		menu.getMenuEntries().add(getMargherita());
		menu.getMenuEntries().add(getPizzaProsciutto());
		menu.getMenuEntries().add(getPizzaCipolla());
		menu.getMenuEntries().add(getPizzaProsciuttoCipolla());
		menu.getMenuEntries().add(getCoke());
		menu.getMenuEntries().add(getLemonade());

		return menu;
	}

	@Bean
	@Scope("singleton")
	Consummation getMargherita() {
		return new Pizza();
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciutto() {
		return new HamTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaCipolla() {
		return new OnionTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciuttoCipolla() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean
	@Scope("prototype")
	Consummation getCoke() {
		return new Coke(0.5);
	}

	@Bean
	@Scope("prototype")
	Consummation getLemonade() {
		return new Lemonade(0.5);
	}

}