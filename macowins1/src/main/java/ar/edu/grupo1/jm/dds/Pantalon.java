package ar.edu.grupo1.jm.dds;

public class Pantalon extends Prenda {

	private static int precioBase=250;
	
	public double precioFinal(){
		return (valorFijo()+precioBase)*this.tasaImportacion();
	}
	
}
