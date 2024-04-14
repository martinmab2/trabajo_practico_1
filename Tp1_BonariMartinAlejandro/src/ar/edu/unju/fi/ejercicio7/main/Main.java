package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo: ");
		long legajo = scanner.nextLong();
		System.out.println("Ingrese salario: ");
		double salario = scanner.nextDouble();
		scanner.close();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumentoSalarial();
		System.out.println("===============================");
		System.out.println("Datos del empleado con el aumento realizado: ");
		empleado.mostrarDatos();
	}

}
