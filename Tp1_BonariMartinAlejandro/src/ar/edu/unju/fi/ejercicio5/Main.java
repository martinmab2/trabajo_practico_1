package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1, y 9");
		int numero=scanner.nextInt();
		int auxiliarTabla=0;
		int resultado;
		if (numero>=1 && numero<=9) {
			do {
				resultado=numero*auxiliarTabla;
				System.out.println(numero+"x"+auxiliarTabla+"="+resultado);
				auxiliarTabla++;
			}	while(auxiliarTabla<=10);
		}	else {
			System.out.println("El numero ingresado es superior o inferior al del rango solicitado");
		}
		scanner.close();
	}

}
