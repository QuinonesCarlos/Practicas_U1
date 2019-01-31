package Practicas_U1;

import java.util.Scanner;

public class Prac_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cal;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese su calificación");
		cal = leer.nextInt();
		
		if (cal >= 80)
		{
			System.out.println("Aprobado");
		}
		else
		{
			System.out.println("Reprobado");
		}
	}

}
