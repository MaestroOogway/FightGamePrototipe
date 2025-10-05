package Characters;

public class Tank extends CreateVariant {// Product Abstract Class
	protected String name = "tank"; 
	protected int health = 210;
	protected int mana = 110;
	protected int armor = 190;
	protected int atack = 40;
	protected int power = 80;

//abstract product
	public void PoderTank() {
		health += 100;
		armor += 200;
	}

	@Override
	public void CreateVariant() {
		listaluchador.add(new MineroWarrior(name, health, mana, armor, atack, power));

	}

}
