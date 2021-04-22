package ro.ase.cts.strategy.clase;

public class Client {

	private String nume;
	private Strategy strategy;
	
	public Client(String nume, Strategy strategy) {
		super();
		this.nume = nume;
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy){
		
		this.strategy = strategy;
	}
	
	public void platesteNota(float Suma){
		
		System.out.println(nume + " are de plata " + Suma + " lei");
		strategy.realizeazaPlata(Suma);
	}
}
