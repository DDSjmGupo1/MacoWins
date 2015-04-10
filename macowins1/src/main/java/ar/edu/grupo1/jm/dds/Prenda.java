package ar.edu.grupo1.jm.dds;

public abstract class Prenda {

	private static double valorFijo=100;
	private boolean esImportado;
	private Marca marca;

	
	public Prenda(Marca marca){
		esImportado=false;
		this.marca=marca;
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
	
	public double precioFinal(){
		return preciOriginal()*marca.coeficienteMarca(preciOriginal());
	}
	
	public double preciOriginal(){
		return (valorFijo+precioBase())*tasaImportacion();
	}
	
	public abstract double precioBase();
}
