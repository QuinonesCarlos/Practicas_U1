package Practicas_U1;

import java.util.Scanner;

public class Prac_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		
		String nom;
		int ed;
		double al;
		
		System.out.println("Ingrese su nombre");
		nom = leer.nextLine();
		
		System.out.println("Ingrese su edad");
		ed = leer.nextInt();
		
		System.out.println("Ingrese su altura");
		al = leer.nextDouble();
		
		System.out.println("Su nombre es: " + nom);
		System.out.println("Su edad es: " + ed);
		System.out.println("Su altura es: " + al);
		
	}

}
