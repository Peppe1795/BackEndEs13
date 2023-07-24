package Giuseppe.Pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends Menu {

	private double calorie;

	public Toppings(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return getNome() + ", Calorie= " + calorie + ", Prezzo=" + getPrezzo();
	}

}
