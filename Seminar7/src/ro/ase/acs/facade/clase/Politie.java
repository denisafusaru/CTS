package ro.ase.acs.facade.clase;

public class Politie {

	public static boolean esteUrmarit(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0) {
			return false;
		}
		return true;
	}
}
