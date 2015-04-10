package ar.edu.grupo1.jm.dds;

public class Sombrero extends Prenda {

	private double coefMetro;
	
	public Sombrero(Marca marca, double coefMetro){
		super(marca);
		this.coefMetro=coefMetro;
	}
	
	public double precioBase(){
		return 150 + coefMetro;
	}
	
}
