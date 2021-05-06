package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.clase.Cont;
import ro.ase.cts.chainofresponsability.clase.ContCredit;
import ro.ase.cts.chainofresponsability.clase.ContCurent;
import ro.ase.cts.chainofresponsability.clase.ContEconomii;

public class Program {

	public static void main(String[] args) {
	
		Cont contCurent = new ContCurent(400);
		Cont contCreditCont = new ContCredit(300);
		Cont contEconomii = new ContEconomii(100);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCreditCont);
		
		
		contCurent.plateste(50);
		contCurent.plateste(140);
		contCurent.plateste(50);
		contCurent.plateste(200);
		contCurent.plateste(120);
	}

}
