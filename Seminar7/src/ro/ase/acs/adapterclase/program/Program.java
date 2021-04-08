package ro.ase.acs.adapterclase.program;

import ro.ase.acs.adapterclase.clase.AdaptorCreditClase;
import ro.ase.acs.adapterclase.clase.CreditAbstract;

public class Program {

	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50, "Ana");
		afiseazaInfoCredit(adaptorClase);
	}
	
}
