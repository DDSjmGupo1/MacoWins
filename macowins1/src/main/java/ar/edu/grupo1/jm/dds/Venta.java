package ar.edu.grupo1.jm.dds;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	private int anio;
	private int mes;
	private int dia;
	
	public Venta(Prenda unaPrenda, int unaCantidad, int unDia, int unMes, int unAnio){
		prenda=unaPrenda;
		cantidad=unaCantidad;
		anio=unAnio;
		mes=unMes;
		dia=unDia;
	}
	
	public int anio(){
		return anio;
	}

	public int mes(){
		return mes;
	}

	public int dia(){
		return dia;
	}
	
	public double precioVenta(){
		return prenda.precioFinal()*cantidad; 
	}
	
}
