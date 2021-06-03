package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentStub;

public class TestPromovabilitateWithStub {

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		IStudent student = new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
