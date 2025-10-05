package Characters;

import java.util.ArrayList;
import java.util.List;

public abstract class CreateVariant {// Creator abstract class

	protected ArrayList<Luchador> listaluchador = new ArrayList<Luchador>();

	public ArrayList<Luchador> getListaluchador() {
		return listaluchador;
	}

	public void setListaluchador(ArrayList<Luchador> listaluchador) {
		this.CreateVariant();
	}

	// Factory Method
	public abstract void CreateVariant();
}
