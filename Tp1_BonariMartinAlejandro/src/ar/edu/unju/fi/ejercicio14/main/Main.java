package ar.edu.unju.fi.ejercicio14.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero comprendido entre el 3, y 10: ");
		int numero = scanner.nextInt();
		while (numero>10 || numero<3) {
			System.out.println("Error no ingreso un numero valido. Reintentelo");
			numero = scanner.nextInt();
		}
		
		int arreglo[] = new int [numero];
		System.out.println("Se creo un arreglo con "+numero+" elementos...");
		
		int k=0;
		do {
			System.out.println("Ingrese numero "+(k+1)+" : ");
			arreglo[k] = scanner.nextInt();
			k++;
		}
		while (k<numero);
		k=0;
		int suma=0;
		while (k<numero) {
			System.out.println("Numero "+(k+1)+": "+arreglo[k]+" Indice: "+k);
			suma=suma+arreglo[k];
			k++;
		}
		System.out.println("La suma de los valores de los elementos del arreglo es: "+suma);
		scanner.close();
	}

}
