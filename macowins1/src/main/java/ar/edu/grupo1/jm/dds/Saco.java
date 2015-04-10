package ar.edu.grupo1.jm.dds;

public class Saco extends Prenda {

	private double botones;
	
	public Saco(Marca marca, double botones){
		super(marca);
		this.botones=botones;
	}
	
	public double precioBase(){
		return 300 + 10*botones;
	}
	
}
