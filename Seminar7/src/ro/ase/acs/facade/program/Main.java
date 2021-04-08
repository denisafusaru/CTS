package ro.ase.acs.facade.program;

import ro.ase.acs.facade.clase.Facade;
import ro.ase.acs.facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("2990716458976","Andreea");
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim credit");
		}
		else{
			System.out.println("Nu oferim credit");
		}
		
		Persoana persoana1 = new Persoana("2990716458922","Andrei");
		if(Facade.esteEligibil(persoana1)) {
			System.out.println("Oferim credit");
		}
		else{
			System.out.println("Nu oferim credit");
		}
	}

}
