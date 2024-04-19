package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] arreglo = new int [8];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 8 numeros: ");
		for (int i=0;i<8;i++) {
			System.out.println("Ingrese el "+(i+1)+"° numero: ");
			arreglo[i] = scanner.nextInt();
		}
		for (int i=0;i<8;i++) {
			System.out.println("Numero "+(i+1)+": "+arreglo[i]+" Indice: "+i);
		}
		scanner.close();
	}

}
