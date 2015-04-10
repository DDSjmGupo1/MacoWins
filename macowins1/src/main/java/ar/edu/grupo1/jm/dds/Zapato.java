package ar.edu.grupo1.jm.dds;

public class Zapato extends Prenda {

	private double talle;
	
	public Zapato(Marca marca, double talle){
		super(marca);
		this.talle=talle;
	}
	
	public double precioBase(){
		return 400 + 5*talle;
	}
	
}
