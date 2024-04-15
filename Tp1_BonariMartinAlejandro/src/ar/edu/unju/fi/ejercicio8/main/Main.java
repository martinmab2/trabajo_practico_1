package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero para calcular la sumatoria y productoria: ");
		int n =scanner.nextInt();
		scanner.close();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		calculadora.CalcularSumatoria();
		System.out.println("Resultado de la sumatoria: "+calculadora.CalcularSumatoria());
		calculadora.CalcularProductoria();
		System.out.println("Resultado de la productoria: "+calculadora.CalcularProductoria());
	}
}