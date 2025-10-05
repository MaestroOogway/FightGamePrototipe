package Combos;

import Characters.*;

public interface MakeCombo {	//Patron fecade
	Combo1 combo1 = new Combo1();
	Combo2 combo2 = new Combo2();

	public static void IsEligible(Luchador luchador) {
		combo1.MakeCombo(luchador);
		
	}

	public static void IsEligible2(Luchador luchador) {
		combo2.MakeCombo(luchador);
	}
}