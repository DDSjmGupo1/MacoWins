package ar.edu.grupo1.jm.dds;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class MacowinsTest {
	
	private Camisa camisaNacional;
	private Marca marca;
	
	@Before 
	public void setup(){
	marca = mock(Marca.class);	
	camisaNacional = new Camisa(marca);
	}
	
	@Test
	public void elPrecioFinalDeUnaCamisaEsCorrecto(){
		when(marca.coeficienteMarca(anyDouble())).thenReturn(1.0);
		
		assertEquals(camisaNacional.precioFinal(), (Double)300.0 );
		
		verify(marca,times(1));
	}
	
	
	
	@Test
	public void camisaEsCorrectoPrecioFinalDeUnaPrenda(){
		MarcaMock marca = new MarcaMock(1.65);
		Camisa camisa = new Camisa(marca);
		Double coef = camisa.precioFinal();
		assertEquals((Double)495.0, coef);
	}

}
