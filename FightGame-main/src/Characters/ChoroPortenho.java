package Characters;

public class ChoroPortenho extends Luchador { // Concrete Product

	public ChoroPortenho(String name, int health, int mana, int armor, int atack, int power) {
		super(name, health, mana, armor, atack, power);
		// TODO Auto-generated constructor stub
	}

	public String golpear() {
		return ("ALETAZO MARINO!!!");
	}

	public String patear() {
		return ("PATADA DE LA JAIBAAAAA!!!");
	}

	public String saltar() {
		return ("PIQUERO INFERNAAAAAL!!!");
	}

	public String LanzarPoder() {
		return ("SHIAAAAAAAAAAAA!!!");
	}

}
