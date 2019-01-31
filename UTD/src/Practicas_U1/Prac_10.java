package Practicas_U1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prac_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prod1, prod2, prod3, sum, inc;

		DecimalFormat formateador = new DecimalFormat("###,###.##");
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del primer producto");
		prod1 = leer.nextDouble();
		
		System.out.println("Ingrese el valor del segundo producto");
		prod2 = leer.nextDouble();
		
		System.out.println("Ingrese el valor del tercer producto");
		prod3 = leer.nextDouble();
		
		sum = prod1 + prod2 + prod3;
		
		if (sum >= 1500)
		{
			inc = (sum * .11) + sum;
			System.out.println("El monto es: " + formateador.format (sum)  + " y el total es: " + formateador.format (inc));
		}
		else {
			inc = (sum * .10) + sum;
			System.out.println("El monto es: " + formateador.format (sum)  + " y el total es: " + formateador.format (inc));
		}
	}

}
