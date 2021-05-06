package ro.ase.cts.state.clase;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {

      if(masa.getStareMasa() instanceof MasaOcupata || masa.getStareMasa() instanceof MasaRezervata) {
    	  System.out.println("Masa cu nr: " + masa.getNrMasa() + " trece in stare libera");
          masa.setStareMasa(this);
      }
      else {
    	System.out.println(  "Masa cu nr: " + masa.getNrMasa() + " este libera");
      }
		
	}
}
