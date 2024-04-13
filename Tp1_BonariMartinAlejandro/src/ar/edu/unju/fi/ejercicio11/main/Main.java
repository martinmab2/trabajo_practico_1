package ar.edu.unju.fi.ejercicio11.main;

public class Main {
	public static void main(String[] args) {
		int j = 40;
		int i = 2; 
		int resultado; 
		for (; j >= 0; j--) {
			resultado = j * i;
			System.out.print(" " + resultado);
			i++;
		}
	}
}