package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		
		NotaAbstracta notaAbstracta = new NotaDePlata(100);
		notaAbstracta.printeaza();
		
		DecoratorAbstract decorator = new DecoratorNotaPasteFericit(notaAbstracta);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decorator2 = new DecoratorNotaLaMultiAni(notaAbstracta);
		decorator2.printeaza();
		
		System.out.println();
		
		NotaAbstracta notaNoua = new NotaDePlata(36);
		DecoratorAbstract decoratorLMANou = new DecoratorNotaLaMultiAni(notaNoua);
		DecoratorAbstract decoratorFelicitare = new DecoratorNotaPasteFericit(decoratorLMANou);
		decoratorFelicitare.printeaza();
		
		System.out.println();
		decoratorFelicitare.printeazaFelicitare();
	}

}
