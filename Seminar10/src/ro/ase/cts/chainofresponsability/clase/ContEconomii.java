package ro.ase.cts.chainofresponsability.clase;

public class ContEconomii extends Cont {
	
	public ContEconomii(float sold) {
		super(sold);
	}

	
	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("Ai platit din contul de economii");
			super.setSold(super.getSold() - suma);
		}
		else {
			if(super.getSuccesor() == null) {
				System.out.println("Nu se poate efectua plata din contul de economii");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
