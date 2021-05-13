package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		
		MeciJucat meciJucat = new MeciJucat("echipa1", "echipa2", 100, 50, 7, 10);
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		meciJucat.setNumeGazda("echipa7");
		meciJucat.setNumeOaspeti("echipa6");
		meciJucat.setNrSpectatori(30);
		meciJucat.setNrBilete(36);
		
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		System.out.println(meciJucat.toString());
		meciJucat.setMemento(managerMemento.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}
