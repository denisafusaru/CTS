package ro.ase.acs.template.clase;

public abstract class TemplateSpectator {

	public abstract void asezareLaCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupareLoc();
	
	//metoda trebuie sa fie finala ca sa respectam design patternul
	public final void intrarePeStadion() {
		asezareLaCoada();
		prezintaBilet();
		realizareControlCorporal();
		ocupareLoc();
	}
}
