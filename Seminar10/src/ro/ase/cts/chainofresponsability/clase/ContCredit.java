package ro.ase.cts.chainofresponsability.clase;

public class ContCredit extends Cont {

	public ContCredit(float sold) {
		super(sold);
		
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("Ai platit din contul de credit");
			super.setSold(super.getSold() - suma);
		}
		else {
			if(super.getSuccesor() == null) {
				System.out.println("Nu se poate efectua plata din contul de credit");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
