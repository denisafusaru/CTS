package program;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		// Vrem sa ne creem o gradina zoologica
		Zoo z = new Zoo();
		
		//Daca vrem sa ne adaugam un animal, trb. sa avem clasele concrete pentru animale
		//Putem folosi clasele concrete peste tot unde am folosit clasele abstracte - CleanCode
		Giraffe giraffe = new Giraffe("Girafa1");
		Giraffe giraffe2 = new Giraffe("Girafa2");

		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
	}

}
