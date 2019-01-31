package Practicas_U1;

import java.util.Scanner;

public class Prac_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, i;
		double cal, prom, acum = 0;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Cuantas calificaciones quiere promediar?");
		n = leer.nextInt();
		i = 1;
		while (i <= n) {
			System.out.println("Ingrese la calificación " + i + ":");
			cal = leer. nextDouble();
			acum = acum + cal;
			i++;
		}
		prom = acum/n;
		System.out.println("El promedio es: " + prom);
		if (prom > 0 && prom <= 49) {
			System.out.println("Suspenso");
		} 
		else {
			if (prom > 50 && prom <= 69) {
				System.out.println("Aprobado");
			}
			else {
				if (prom > 70 && prom <= 89) {
					System.out.println("Notable");
				}
				else {
					if (prom > 90 && prom <= 99) {
						System.out.println("Sobresaliente");
					}
					else {
						if (prom == 100) {
							System.out.println("Matrícula de honor");
						}
					}
				}
			}
		}
		
	}

}
