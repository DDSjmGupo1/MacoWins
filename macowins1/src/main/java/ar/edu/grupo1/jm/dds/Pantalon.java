package ar.edu.grupo1.jm.dds;

public class Pantalon extends Prenda {

	private double cmDeTela;
	
	public Pantalon(Marca marca, double cmDeTela){
		super(marca);
		this.cmDeTela=cmDeTela;
	}
	
	public double precioBase(){
		return 250 + cmDeTela;
	}
	
	
	
}
