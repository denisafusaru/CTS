package ro.ase.cts.command.clase;

public class ContBancar {

	private String destinatar;
	private float sold;
	
	public ContBancar(String destinatar, float sold) {
		super();
		this.destinatar = destinatar;
		this.sold = sold;
	}
	
	public void constituire(float suma) {
		sold=suma;
		System.out.println("S-a constituit contul cu suma " + suma);
	}
	
	public void retragere(float suma) {
		if(suma<=sold) {
			sold=suma;
			System.out.println("S-a retras suma de" + suma);
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
	}
	
	public void depunere(float suma) {
		sold+=suma;
		System.out.println("S-a depus suma " + suma);
	}
	
		
}
