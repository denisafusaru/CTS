package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy{
	
	float SumaDisponibila;

	public Portofel(float sumaDisponibila) {
		super();
		SumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(float Suma) {
		if(SumaDisponibila >= Suma)
		{
			System.out.println("Tranzactia fost efectuata cash pentru suma de: " + Suma + " lei.");
			SumaDisponibila = Suma - SumaDisponibila;
		}
		else 
		{
			System.out.println("Tranzactia nu fost efectuata - fonduri insuficiente");
		}
		
	}

}
