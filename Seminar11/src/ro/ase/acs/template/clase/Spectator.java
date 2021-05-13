package ro.ase.acs.template.clase;

public class Spectator extends TemplateSpectator {

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		// TODO Auto-generated method stub
		System.out.println(nume + " s-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(nume + " a prezentat biletul");
	}

	@Override
	public void realizareControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println(nume + " a realizat controlul corporal");
	}

	@Override
	public void ocupareLoc() {
		// TODO Auto-generated method stub
		System.out.println(nume + " a ocupat locul");
	}

	
}
