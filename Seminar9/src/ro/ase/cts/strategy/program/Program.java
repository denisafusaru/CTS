package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		
		Portofel portofel = new Portofel(300);
		
		Client client1 = new Client("Andrei", portofel);
		
		client1.platesteNota(280);
		client1.setStrategy(new Card());
		
		client1.platesteNota(100);
		client1.setStrategy(portofel);
		
		client1.platesteNota(200);
	}

}
