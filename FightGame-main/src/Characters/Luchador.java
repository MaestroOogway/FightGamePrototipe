package Characters;

public abstract class Luchador { // Product Abstract Class
	public String name;
	public int health;
	public int mana;
	public int armor;
	public int atack;
	public int power;


	public Luchador(String name, int health, int mana, int armor, int atack, int power) {
		super();
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.armor = armor;
		this.atack = atack;
		this.power = power;
	}

	public abstract String golpear();

	public abstract String patear();

	public abstract String saltar();

	public abstract String LanzarPoder();

}
