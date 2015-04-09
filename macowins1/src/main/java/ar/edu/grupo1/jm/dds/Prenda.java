package ar.edu.grupo1.jm.dds;

public abstract class Prenda {

	private static double valorFijo=100;
	private boolean esImportado;
	
	public Prenda(){
		esImportado=false;
	}
		
	public void esImportado(boolean esImportado){
		this.esImportado=esImportado;
	}
	
	public double valorFijo(){
		return valorFijo;
	}
	
	public double tasaImportacion(){
		if(esImportado){
			return 1.3;
		}
		else{
			return 1;
		}
	}
	
	public abstract double precioFinal();
	
}
