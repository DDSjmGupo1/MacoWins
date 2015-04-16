package ar.edu.grupo1.jm.dds;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Before;

public class SarkanyTest{
	
	private Sarkany sarkany;
	
	@Before
	public void setup(){
		sarkany = new Sarkany();
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrectoSiPrecioEs500() {
	// Operaciones
		Double coeficiente = sarkany.coeficienteMarca(500);
	// Post Condicion
		assertEquals(coeficiente, (Double)1.1);
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrectoSiPrecioEsMayorA500() {
		Double coeficiente = sarkany.coeficienteMarca(501);
		assertEquals(coeficiente, (Double)1.35);
	}
	
}



