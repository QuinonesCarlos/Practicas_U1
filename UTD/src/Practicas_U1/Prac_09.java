package Practicas_U1;

import java.util.Scanner;

public class Prac_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int op;
		double cantidad, resultado, pulc, piec, pp;
		pulc = 2.54;
		piec = 30.48;
		pp = 12;
		
		System.out.println("Seleccione una opción del siguiente menú:");
		System.out.println("");
		System.out.println("1: Pulgadas a centímetros");
		System.out.println("2: Pies a centímetros");
		System.out.println("3: Pies a pulgadas");
		op = leer.nextInt();
		
		switch (op)
		{
		case 1: System.out.println("Ingrese las pulgadas que desea convertír a centímetros");
		cantidad = leer.nextDouble();
		resultado = cantidad * pulc;
		System.out.println(cantidad + " pulgadas son: " + resultado + " centímetros");
		break;
		case 2: System.out.println("Ingrese los pies que desea convertír centímetros");
		cantidad = leer.nextDouble();
		resultado = cantidad * piec;
		System.out.println(cantidad + " pies son: " + resultado + " centímetros");
		break;
		case 3: System.out.println("Ingrese los pies que desea convertir a pulgadas");
		cantidad = leer.nextDouble();
		resultado = cantidad * pp;
		System.out.println(cantidad + " pies son: " + resultado + " pulgadas");
		break;
		default: System.out.println("Teclee una de las opciones mostradas");
	    }
		
	}
		
}


