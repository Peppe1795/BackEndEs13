package Giuseppe.Pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Drink extends Menu {

	private double calorie;

	public Drink(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return getNome() + " calorie= " + calorie + "Prezzo= " + getPrezzo();
	}
}
