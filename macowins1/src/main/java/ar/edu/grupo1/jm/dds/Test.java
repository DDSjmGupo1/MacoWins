package ar.edu.grupo1.jm.dds;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Negocio macowins= new Negocio();
		
		Armani armani= new Armani();
		Sarkany sarkany= new Sarkany();
		
		Pantalon pantalon= new Pantalon(armani,100);
		Camisa camisa= new Camisa(armani);
		Saco saco=new Saco(armani,3);
		Zapato zapato= new Zapato(sarkany,38);
		Sombrero sombrero= new Sombrero(armani,50);
		saco.esImportado(true);
		sombrero.esImportado(true);
		
		macowins.agregarVenta(pantalon,2,30,03,2015);
		macowins.agregarVenta(camisa,5,01,01,2015);
		macowins.agregarVenta(saco,1,30,03,2015);
		macowins.agregarVenta(zapato,1,30,03,2015);
		macowins.agregarVenta(sombrero,1,01,01,2015);
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Ingrese dia: ");
		int dia= Integer.parseInt(entrada.nextLine());
		System.out.print("Ingrese mes: ");
		int mes= Integer.parseInt(entrada.nextLine());
		System.out.print("Ingrese año: ");
		int anio= Integer.parseInt(entrada.nextLine());
		entrada.close();
		
		System.out.println("Las ganancias del "+dia+"/"+mes+"/"+anio+" son: $"+macowins.gananciasDelDia(dia, mes, anio));

	}

}
