package Characters;

public class MineroWarrior extends Luchador {// Concrete Product
	public MineroWarrior(String name, int health, int mana, int armor, int atack, int power) {
		super(name, health, mana, armor, atack, power);
		// TODO Auto-generated constructor stub
	}

	public String golpear() {
		return ("PU�O DEL PIRQUINEROOOO!!!");
	}

	public String patear() {
		return ("PATADA DEL CATEADOOOOOOR!!!");
	}

	public String saltar() {
		return ("SALTO EXPLOSIVOOOOO!!!");
	}

	public String LanzarPoder() {
		return ("EXPLOSION A TAJO ABIERTOOOOOO!!!");
	}

}
