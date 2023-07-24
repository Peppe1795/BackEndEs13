package Giuseppe.Pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PizzaApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaApplication.class);
		ciaoAncora(ctx);
		menu(ctx);
		SpringApplication.run(PizzaApplication.class, args);
		ctx.close();
	}

	public static void ciaoAncora(AnnotationConfigApplicationContext ctx) {
		log.info((String) ctx.getBean("saluta"));

	}

	public static void menu(AnnotationConfigApplicationContext ctx) {
		log.info("Menu Pizzeria GodFather");
		log.info("------ Pizze ------");
		log.info(ctx.getBean("getMargherita").toString());
		log.info(ctx.getBean("getProsciutto").toString());
		log.info(ctx.getBean("getOrrore").toString());
		log.info("------- Toppings -----");
		log.info(ctx.getBean("getToppings").toString());
		log.info("------- Drinks -------");
		log.info(ctx.getBean("getCocacola").toString());
		log.info(ctx.getBean("getSprite").toString());
		log.info("------ Franchise ------");
		log.info(ctx.getBean("getCappello").toString());
		log.info(ctx.getBean("getMaglietta").toString());

	}
}
