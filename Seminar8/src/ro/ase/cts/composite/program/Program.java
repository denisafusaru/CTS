package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) throws Exception {
		
		ComponentaMeniu meniu = new Sectiune("MENIU");
		ComponentaMeniu sectiuneBauturi=new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("Desert");

		ComponentaMeniu elementCafea=new Element("cafea");
		ComponentaMeniu elementFrappe=new Element("frappe");
		ComponentaMeniu elementTiramisu=new Element("tiramisu");
		
		sectiuneBauturi.adaugaNod(elementCafea);
		sectiuneBauturi.adaugaNod(elementFrappe);
		sectiuneDesert.adaugaNod(elementTiramisu);
		meniu.adaugaNod(sectiuneDesert);
		meniu.adaugaNod(sectiuneBauturi);
		meniu.printeaza();
		
		System.out.println();
		
		sectiuneBauturi.stergeNod(elementFrappe);
		sectiuneDesert.adaugaNod(elementFrappe);
		meniu.printeaza();
	}

}
