package ar.edu.grupo1.jm.dds;

public class Saco extends Prenda {

	private static int precioBase=300;
	
	public double precioFinal(){
		return (valorFijo()+precioBase)*this.tasaImportacion();
	}
	
}
