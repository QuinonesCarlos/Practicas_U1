package Practicas_U1;

import java.util.Scanner;

public class Prac_10_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
	
		int num = 0, suma = 0, i = 0;
		
		do {
			System.out.println("Ingrese un número del 0 al 76");
			num = leer.nextInt();
			if (num >= 0 && num <= 76)
			{
				suma = suma + num;
				i ++;
			}
		} while (num <= 76);
			
		
		System.out.println("Cantidad de numeros: " + i);
		System.out.println("El promedio de la suma de todos lo numeros ingresados es: " + (suma/i));
	}

}
