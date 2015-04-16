package ar.edu.grupo1.jm.dds;

public class Sarkany implements Marca{
	
	public double coeficienteMarca(double preciOriginal){
		return preciOriginal>500 ? 1.35 : 1.1;
	}
}
