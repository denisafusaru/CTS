package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {

	//Right-BICEP
	
	@Test
	public void testConstructorCorrect() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	//Boundary Conditions
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	//Error Condition
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptie() {
		Grupa grupa = new Grupa(988);
		//ne asteptam sa ne arunce o exceptie	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptieinAfaraLimitei() {
		Grupa grupa = new Grupa(1200);	
	}
	
	//Performance 
	
	@Test(timeout = 500)
	@Category(TesteUrgenteCategory.class)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1070);	
	}
	
	//Correct - Existence
	
	@Test(timeout = 500)
	@Category(TesteNormaleCategory.class)
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa(1070);
		assertNotNull(grupa.getStudenti());
	}
	
	//reluam principiile de la Right - BICEP pentru metoda getPromovabilitate
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for(int i=0;i<3;i+=1) {
			Student student = new Student("Dimitrie");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<7;i+=1) {
			Student student = new Student("Matei");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1f);
	}
	
	//Boundary Conditions - 0 si 1 limitele extreme
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1083);
		for(int i=0;i<3;i+=1) {
			Student student = new Student("Dimitrie");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1f);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		for(int i=0;i<7;i+=1) {
			Student student = new Student("Dimitrie");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1f);
	}
	
	//Error Conditions
	//Daca nu avem niciun student in lista
	
	@Test(expected=IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateErrorConditions() {
		Grupa grupa = new Grupa(1083);
		grupa.getPromovabilitate();
	}
	
}
