package luqmanmohammad.U2D3SpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import luqmanmohammad.U2D3SpringBoot.entities.Menu;
import luqmanmohammad.U2D3SpringBoot.configs.MenuConfig;

@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		System.out.println("CIAO");
		Menu menu = ctx.getBean(Menu.class);

		menu.print();

		ctx.close();

	}

}