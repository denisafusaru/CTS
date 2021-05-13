package ro.ase.cts.observer.program;

import ro.ase.acs.observer.clase.Client;
import ro.ase.acs.observer.clase.ManagerSala;
import ro.ase.acs.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala = new ManagerSala("Sala nr. 3");
		Observer client1 = new Client("Alin");
		Observer client2 = new Client("Marius");
		Observer client3 = new Client("Ion");
		
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.trimiteAnuntImportant("Volei");
		managerSala.stergeAbonat(client3);
		managerSala.trimiteAnuntImportant("Handbal");
		
	}

}
