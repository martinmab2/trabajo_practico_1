package ar.edu.unju.fi.ejercicio15.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero comprendido entre 5, y 10: ");
		int numero = scanner.nextInt();
		while (numero<5 || numero>10) {
			System.out.println("Error en la carga de datos, el numero no es valido, pruebe nuevamente: ");
			numero = scanner.nextInt();
		}
		String arreglo[] = new String[numero];
		System.out.println("Se creo un arreglo de cadenas con "+numero+" elementos..");
		
		int i=0;
		scanner.nextLine();
		do {
			System.out.println("Ingrese la cadena "+(i+1)+" del arreglo");
			arreglo[i] =scanner.nextLine();
			i++;
		}	
		while (i<numero);
		while (i>0) {
			i--;
			System.out.println("Cadena "+(i+1)+" del arreglo: "+arreglo[i]);
		}
		scanner.close();
	}
}