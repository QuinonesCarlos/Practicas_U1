package Practicas_U1;

import java.util.Scanner;

public class Prac_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		int num, i = 0, acum = 0;
		
		System.out.println("Ingrese la cantidad de numeros");
		num = leer.nextInt();
		
		for (i = 0; i <= num; i+=2) {
			acum = acum + i;
			System.out.println("");
		}
		
	}

}
