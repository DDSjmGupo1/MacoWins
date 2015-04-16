package ar.edu.grupo1.jm.dds;

//import ar.edu.grupo1.jm.dds.Marca;

public class MarcaMock implements Marca {

	private Double coeficiente;
	
	public MarcaMock(Double coeficiente){
		this.coeficiente= coeficiente;
	}
	
	@Override
	public double coeficienteMarca(double preciOriginal) {
		return coeficiente;
	}

}
