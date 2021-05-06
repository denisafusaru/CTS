package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa nu se poate ocupa");
		}
		else {
			masa.setStareMasa(this);
			System.out.println("Masa");
		}
	}
	

}
