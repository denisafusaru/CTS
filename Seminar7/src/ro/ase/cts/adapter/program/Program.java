package ro.ase.cts.adapter.program;

import ro.ase.acs.adapter.clase.AdaptorCreditObiecte;
import ro.ase.acs.adapter.clase.CreditAbstract;
import ro.ase.acs.adapter.clase.Leasing;

public class Program {
	
	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		
		Leasing leasing = new Leasing (100, "Ion");
		//afiseazaInfoCredit(leasing, leasing.getSuma()); // nu putem afisa leasing
		AdaptorCreditObiecte adaptor = new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor, leasing.getSuma());
	}

}
