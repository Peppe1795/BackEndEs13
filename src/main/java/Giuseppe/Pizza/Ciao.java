package Giuseppe.Pizza;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class Ciao {
	@Bean
	String saluta() {
		return "Ciao mondo";
	}

	@Bean
	Pizze getMargherita() {
		return new Pizze("Margherita(pomodoro, mozzarella)", 5.50, 1550.5, Size.STANDARD);
	}

	@Bean
	Pizze getProsciutto() {
		return new Pizze("Margherita con prosciutto(pomodoro, mozzarella, prosciutto)", 5.50, 1550.5, Size.LARGE);
	}

	@Bean
	Pizze getOrrore() {
		return new Pizze("Margherita con ananas(pomodoro, mozzarella, prosciutto, ananas)", 5.50, 1550.5, Size.LARGE);
	}

	@Bean
	Drink getCocacola() {
		return new Drink("Cocacola", 2.50, 3000.25);
	}

	@Bean
	Drink getSprite() {
		return new Drink("Sprite", 3.50, 3000.25);
	}

	@Bean
	Prodotti getCappello() {
		return new Prodotti("Nike", 45.50);
	}

	@Bean
	Prodotti getMaglietta() {
		return new Prodotti("Adidas", 60.50);
	}

	@Bean
	public void getToppings() {
		List<Toppings> topping = new ArrayList<>();
		Toppings top1 = new Toppings("Cheese", 1.50, 1500.5);
		Toppings top2 = new Toppings("Salami", 2.50, 2500.4);
		Toppings top3 = new Toppings("olive", 4.50, 3000.5);
		Toppings top4 = new Toppings("basilico", 0.50, 500.1);
		topping.add(top1);
		topping.add(top2);
		topping.add(top3);
		topping.add(top4);

		log.info(topping.toString());

	}
}
