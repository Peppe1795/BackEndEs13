package Giuseppe.Pizza;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizze extends Menu {
	private List<String> toppings = new ArrayList<>();
	private double calorie;
	private Size size;

	public Pizze(String nome, double prezzo, double calorie, Size size) {
		super(nome, prezzo);
		this.calorie = calorie;
		this.size = size;
	}

	@Override
	public String toString() {
		return getNome() + ", calorie= " + calorie + "Prezzo= " + getPrezzo() + ", size=" + size;
	}

}
