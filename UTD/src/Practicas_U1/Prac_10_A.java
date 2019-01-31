package Practicas_U1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prac_10_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		
		int c = 0;
		int control;
		double precio, sum = 0, inc;
		
		
		do {
			c++;
			System.out.println("Ingrese el precio del producto " + c);
			precio = leer.nextDouble();
			sum = sum + precio;
			System.out.println("Quiere ingresar otro producto?");
			System.out.println("");
			System.out.println("Presione 1 para Si, 2 para No");
			control = leer.nextInt();
		}
		
		while (control == 1);
		
		if (sum >= 1500)
		{
			inc = (sum * .11) + sum;
			System.out.println("Número de productos: " + formateador.format (c) + " el momto es: " + formateador.format (sum) + " el monto total es: " + formateador.format (inc));
		}
		else 
		{
			inc = (sum * .10) + sum;
			System.out.println("Número de productos: " + formateador.format (c) + " el momto es: " + formateador.format (sum) + " el monto total es: " + formateador.format (inc));
		}
		
	}

}
