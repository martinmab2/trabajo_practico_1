package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero entero: ");
		int numeroEntero = scanner.nextInt();
		int doble=2;
		int triple=3;
		 if (numeroEntero%2==0) {
			 numeroEntero = numeroEntero * triple;
			 System.out.println("El numero es par, y su triple es igual a: "+ numeroEntero);
		 }
		 else {
			 numeroEntero = numeroEntero * doble;
			System.out.println("El numero es impar, y su doble es igual a: "+ numeroEntero);
		}
		 scanner.close();
	}

}
