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
		
		System.out.println("Seleccione una opci�n del siguiente men�:");
		System.out.println("");
		System.out.println("1: Pulgadas a cent�metros");
		System.out.println("2: Pies a cent�metros");
		System.out.println("3: Pies a pulgadas");
		op = leer.nextInt();
		
		switch (op)
		{
		case 1: System.out.println("Ingrese las pulgadas que desea convert�r a cent�metros");
		cantidad = leer.nextDouble();
		resultado = cantidad * pulc;
		System.out.println(cantidad + " pulgadas son: " + resultado + " cent�metros");
		break;
		case 2: System.out.println("Ingrese los pies que desea convert�r cent�metros");
		cantidad = leer.nextDouble();
		resultado = cantidad * piec;
		System.out.println(cantidad + " pies son: " + resultado + " cent�metros");
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


