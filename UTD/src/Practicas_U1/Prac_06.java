package Practicas_U1;

import java.util.Scanner;

public class Prac_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		num = leer.nextInt();
		
	if (num%2==0)
	    System.out.println("El número es par");
	else
	    System.out.println("El número es impar");
		
	}

}
