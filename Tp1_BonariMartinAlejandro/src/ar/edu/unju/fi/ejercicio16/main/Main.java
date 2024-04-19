package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String arregloDeStrings[]= new String[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese la cadena "+(i+1)+" : ");
			arregloDeStrings[i]= scanner.nextLine();
		}
		int i=0;
		System.out.println("Tamaño del array: "+arregloDeStrings.length);
		while (i<5) {
			System.out.println("========================");
			System.out.println(arregloDeStrings[i]);
			System.out.println("Indice: "+i);
			i++;
		}
		byte eliminar;
		do {
			System.out.println("Ingrese el indice (numero a partir del 0 al 5) de la cadena que desea eliminar del array: ");
			eliminar = scanner.nextByte();
		}
		while (eliminar<0 || eliminar>5);
		scanner.close();
		i=0;
		for(i=eliminar;i<5-1;i++) {
			arregloDeStrings[i]=arregloDeStrings[i+1];
		}
		arregloDeStrings[5-1]=""; // o lo que es lo mismo, poner [arregloDeStrings.length-1]
		
		i=0;
		while (i<5) {
			System.out.println("========================");
			System.out.println(arregloDeStrings[i]);
			System.out.println("Indice: "+i);
			i++;
		}
	}
}