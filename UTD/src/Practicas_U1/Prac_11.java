package Practicas_U1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prac_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		
		int op;
		double cantidad, resultado, pulc, piec, pp;
		pulc = 2.54;
		piec = 30.48;
		pp = 12;
		
		do {
			System.out.println("Elija una opción del siguiente menú");
			System.out.println("");
			System.out.println("1: Pulgadas a centímetros");
			System.out.println("2: Pies a centímetros");
			System.out.println("3: Pies a pulgadas");
			System.out.println("4: Salir");
			op = leer.nextInt();
			
			switch (op)
			{
			case 1: System.out.println("Ingrese las pulgadas que desea convertír a centímetros");
			cantidad = leer.nextDouble();
			resultado = cantidad * pulc;
			System.out.println(cantidad + " pulgadas son: " + formateador.format (resultado) + " centímetros");
			break;
			case 2: System.out.println("Ingrese los pies que desea convertír centímetros");
			cantidad = leer.nextDouble();
			resultado = cantidad * piec;
			System.out.println(cantidad + " pies son: " + formateador.format (resultado) + " centímetros");
			break;
			case 3: System.out.println("Ingrese los pies que desea convertir a pulgadas");
			cantidad = leer.nextDouble();
			resultado = cantidad * pp;
			System.out.println(cantidad + " pies son: " + formateador.format (resultado) + " pulgadas");
			break;
			case 4: System.out.println("Gracias por usar el programa");
			break;
			default: System.out.println("Ingrese solo las opciones que estan en pantalla");
		    }
			
		}
		while (op < 4);
		
	}

}
