package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero entre 1 y 10: ");
		int numero=scanner.nextInt();
		if (numero>10 || numero<1) {
			System.out.println("El numero ingresado no es valido, no esta dentro del rango solicitado");
		}
		else {
			int resultado=numero;
			int auxiliar=1;
			while (numero>auxiliar) {
					resultado=resultado*auxiliar;
					auxiliar++;
			}
			System.out.println("El resultado es: " + resultado);
		}
		scanner.close();
	}
}

