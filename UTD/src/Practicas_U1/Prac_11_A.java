package Practicas_U1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prac_11_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_empleados, i;
		double sueldo = 0, maximo = 0, minimo = 999999999, total = 0, isr = 0;
		Scanner leer = new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat ("###,###.##");
		
		System.out.println("Ingrese el número de empleados");
		num_empleados = leer.nextInt();
		i = 1;
		do {
			System.out.println("Ingrese el sueldo del empleado " + i);
			sueldo = leer.nextDouble();
			total = total + sueldo;
			if (sueldo < minimo)
			{
				minimo = sueldo;
			}
			if (sueldo > maximo )
			{
				maximo = sueldo;
			}
			i++;
		} while (i <= num_empleados);
		isr = total * .33;
		System.out.println("El total es: " + formateador.format(total));
		System.out.println("El ISR es: " + formateador.format(isr));
		System.out.println("El máximo es: " +  formateador.format(maximo));
		System.out.println("El minimo es: " + formateador.format(minimo));
	}

}
