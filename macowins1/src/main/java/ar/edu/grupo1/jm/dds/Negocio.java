package ar.edu.grupo1.jm.dds;
import java.util.*;
import java.util.stream.*;


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
		
		
		Stream<Venta> ventasDelDia= listaVentas.stream().filter(venta -> (venta.dia()==dia)&&(venta.mes()==mes)&&(venta.anio()==anio));
		
		double ganancias= ventasDelDia.mapToDouble(venta -> venta.precioVenta()).sum();
		
		return ganancias;
		
	}
}
