package ar.edu.grupo1.jm.dds;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ArmaniTest {
	
	private Armani armani;
	
	@Before
	public void setup(){
		armani = new Armani();
	}

	@Test
	public void elCoeficienteDeMarcaEsCorrecto() {
		Double coeficiente = armani.coeficienteMarca(100);
		assertEquals((Double)1.65, coeficiente);
	}

}
