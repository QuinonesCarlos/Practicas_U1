package Practicas_U1;

import java.util.Scanner;

public class Prac_12_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		int n, i, mayor = 0, menor = 0;
		double prom, cm, acum = 0;
		
		System.out.println("Cuantos clientes va a ingresar");
		n = leer.nextInt();
		i = 1;
		while (i <= n) {
			System.out.println("Ingrese el consumo por mes del cliente no. " + i);
			cm = leer.nextDouble();
			acum = acum + cm;
			if (cm > 100) {
				mayor++;
			}
			else {
				 menor++;
			}
			i++;
		}
		prom = acum/n;
		System.out.println("El total de minutos de clientes es: " + acum);
		System.out.println("El consumo promedio es: " + prom);
		System.out.println("Clientes que consumen mas de 100 minutos al mes: " + mayor);
		System.out.println("Clientes que consumen menos de 100 minutos al mes: " + menor);
	}

}
