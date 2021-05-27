package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupaCuFixture {

private Grupa grupa;
	
	@Before
	public void setUp() {
		grupa=new Grupa(1083);
		for(int i=0;i<35;i+=1) {
			Student student = new Student("Dimitrie");
			for(int j=0;j<7;j++) {
				student.adaugaNota(8);
			}
			grupa.adaugaStudent(student);
		}
	}
	
	//Performance
	
	@Test(timeout = 500)
	public void testPromovabilitatePerformanta() {
		grupa.getPromovabilitate();
	}

}
