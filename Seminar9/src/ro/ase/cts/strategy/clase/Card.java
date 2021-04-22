package ro.ase.cts.strategy.clase;

public class Card implements Strategy{

	@Override
	public void realizeazaPlata(float Suma) {
		
		System.out.println("Tranzactia a fost efectuata card pentru suma de: " + Suma + " lei.");
	}

}
