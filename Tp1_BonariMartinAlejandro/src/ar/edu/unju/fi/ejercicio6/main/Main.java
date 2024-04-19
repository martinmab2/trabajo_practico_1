package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;
public class Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Instanciación utilizando constructor por defecto
        Persona personaVacio = new Persona();
        System.out.println("Datos de la persona utilizando constructor por defecto:");
        personaVacio.mostrar();
        System.out.println();
        
        // Instanciación utilizando constructor parametrizado
        System.out.println("Ingrese los datos para crear una persona utilizando constructor parametrizado:");
        System.out.print("DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (formato yyyy-MM-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        Persona personaParametrizada = new Persona(dni, fechaNacimiento, nombre, provincia);
        System.out.println("Datos de la persona utilizando constructor parametrizado:");
        personaParametrizada.mostrar();
        System.out.println();
        
        // Instanciación utilizando constructor con dni, nombre y fecha de nacimiento y provincia por defecto
        System.out.println("Ingrese los datos para crear una persona utilizando constructor con dni, nombre y fecha de nacimiento:");
        System.out.print("DNI: ");
        dni = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (formato yyyy-MM-dd): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, fechaNacimiento, nombre);
        System.out.println("Datos de la persona utilizando constructor con dni, nombre y fecha de nacimiento:");
        persona3.mostrar();
        
        scanner.close(); 
	}

}
