package Characters;

public class Mage extends CreateVariant {//// Product Abstract Class
	protected String name = "mage"; 
	protected int health = 110;
	protected int mana = 200;
	protected int armor = 60;
	protected int atack = 20;
	protected int power = 180;

//abstract product
	public void PoderSocrecer() {
		power += 100;
		mana += 200;
	}

	@Override
	public void CreateVariant() {
		// TODO Auto-generated method stub

	}
}
