package Practicas_U1;

import java.util.Scanner;

public class Prac_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		
		double gf, gc;
		
		System.out.println("Ingrese una cantidad en grados Fahrenheit");
		gf = leer.nextDouble();
		
		gc = (gf-32)/1.8;
		
		System.out.println("Grados Fahrenheit: " + gf);
		System.out.println("Grados Centigrados: " + gc);
		
	}

}
