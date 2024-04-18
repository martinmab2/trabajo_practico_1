package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento (en formato dd/mm/yyyy):");
		String fechadeNacimiento = scanner.nextLine();
		int separadorUno=fechadeNacimiento.indexOf("/");
		int separadorDos=fechadeNacimiento.lastIndexOf("/");
		int dia = Integer.parseInt(fechadeNacimiento.substring(0, separadorUno));
		int mes = Integer.parseInt(fechadeNacimiento.substring(separadorUno+1, separadorDos))-1;
		int anio = Integer.parseInt(fechadeNacimiento.substring(separadorDos+1));
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
		fechaNacimiento.set(Calendar.MONTH, mes);
		fechaNacimiento.set(Calendar.YEAR, anio);
		Persona persona = new Persona(nombre, fechaNacimiento);
		String signo = persona.CalcularSignoZodiaco();
		persona.CalcularEdadPersona();
		String estacion = persona.CalcularEstacion();
		System.out.println("Nombre de la persona: "+nombre);
		System.out.println("Fecha de nacimiento: "+fechadeNacimiento);
		System.out.println("Edad: "+persona.CalcularEdadPersona());
		System.out.println("Signo Zodiacal: "+signo);
		System.out.println("Esacion en la que nacio: "+estacion );
		scanner.close();
	}
}