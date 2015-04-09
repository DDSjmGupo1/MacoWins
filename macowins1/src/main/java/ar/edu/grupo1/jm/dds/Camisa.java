package ar.edu.grupo1.jm.dds;

public class Camisa extends Prenda {

	private static int precioBase=200;
	
	public double precioFinal(){
		return (valorFijo()+precioBase)*this.tasaImportacion();
	}
	
}
