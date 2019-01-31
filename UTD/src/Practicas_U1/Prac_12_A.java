package Practicas_U1;

import java.util.Scanner;

public class Prac_12_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		
		int num, i, menor=0, mayor=0;
		double val;
		
		System.out.println("Ingrese el número de ventas");
		num = leer.nextInt();
		
		i = 1;
		while (i <= num) {
			System.out.println("Ingrese el costo de la venta no. " + i);
			val = leer.nextDouble();
			if (val <= 200) {
				menor++;
			}
			else {
				if (val > 200 && val <= 400) {
					mayor++;
				}
			}
			i++;
		}
		System.out.println("La cantidad de ventas menores de $ 200 fueron: " + menor);
		System.out.println("La cantidad de ventas mayores de $ 200 y menores de $ 400 fueron: " + mayor);
		
	}

}
