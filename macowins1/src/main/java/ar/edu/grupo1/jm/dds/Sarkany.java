package ar.edu.grupo1.jm.dds;

public class Sarkany implements Marca{
	
	public double coeficienteMarca(double preciOriginal){
		if (preciOriginal>500){
			return 1.35;
		}
		else {
			return 1.1;
		}
	}
}
