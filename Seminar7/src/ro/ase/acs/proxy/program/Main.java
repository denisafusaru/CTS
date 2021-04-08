package ro.ase.acs.proxy.program;

import ro.ase.acs.proxy.clase.Credit;
import ro.ase.acs.proxy.clase.Proxy;
import ro.ase.acs.proxy.clase.TipMoneda;

public class Main {

	public static void main(String[] args) {
		
		Credit credit = new Credit();
		credit.oferaCredit(TipMoneda.EUR, 100);
		
		Proxy proxy = new Proxy(credit);
		proxy.oferaCredit(TipMoneda.EUR, 100);
		proxy.oferaCredit(TipMoneda.RON, 1000);	
	}

}
