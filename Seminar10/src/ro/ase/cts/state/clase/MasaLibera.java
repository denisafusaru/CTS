package ro.ase.cts.state.clase;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaOcupata || masa.getStareMasa() instanceof MasaRezervata) {
			
		}	
	}
}
