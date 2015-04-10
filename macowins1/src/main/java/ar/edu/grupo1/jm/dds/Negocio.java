package ar.edu.grupo1.jm.dds;
import java.util.*;


public class Negocio {
	
	private Set<Venta> listaVentas;
	
	public Negocio(){
		listaVentas= new HashSet<Venta>();
	}
	
	public void agregarVenta(Prenda unaPrenda, int unaCantidad, int unDia, int unMes, int unAnio) {
		Venta unaVenta= new Venta(unaPrenda, unaCantidad, unDia, unMes, unAnio);
		listaVentas.add(unaVenta);
	}
	
	public double gananciasDelDia(int dia, int mes, int anio){
		
		/*
		Set<Double> ganancias= listaVentas.stream().filter(venta -> venta.dia()==diaa).map(venta -> venta.precioVenta()).collect(Collectors.toSet());
		
		return ganancias;
		*/

		double ganancias=0;
		
		for(Venta venta: listaVentas){
			if (venta.anio()==anio && venta.mes()==mes && venta.dia()==dia){
				ganancias+=venta.precioVenta();
			}
		
		}
			
		return ganancias;
		
	}
}
