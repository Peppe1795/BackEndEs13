package Giuseppe.Pizza;

public class Prodotti extends Menu {

	public Prodotti(String nome, double prezzo) {
		super(nome, prezzo);
	}

	@Override
	public String toString() {
		return "Nome= " + getNome() + " Prezzo= " + getPrezzo();
	}

}
