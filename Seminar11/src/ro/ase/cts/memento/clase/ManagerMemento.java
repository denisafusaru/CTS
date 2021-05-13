package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<Memento> mementos = new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento getMemento(int pozitia) {
		if(pozitia>=0 && pozitia<mementos.size()) {
			return mementos.get(pozitia);
		}
		else {
			throw new IllegalArgumentException("Pozitia nu e valida");
		}
	}
}
