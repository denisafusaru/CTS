package ro.ase.acs.proxy.clase;

public class Credit implements CreditAbstract{

	@Override
	public void oferaCredit(TipMoneda tip, float suma) {
		
		System.out.println("S-a achizitionat un credit de " + suma+ " " + tip);
	}
	
}
