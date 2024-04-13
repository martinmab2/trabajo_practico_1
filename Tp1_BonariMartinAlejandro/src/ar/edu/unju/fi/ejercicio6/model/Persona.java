package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

//inicializacion de cada atributo (como privado)

public class Persona {
	private int dni;
	private LocalDate fechaNacimiento;
	private String nombre;
	private String provincia;
	
	public Persona() {
		this.fechaNacimiento=LocalDate.now();
	}
	
	// clase constructora con los parametros y constructor de cada atributo
	
	public Persona(int dni, LocalDate fechaNacimiento, String nombre, String provincia) {
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.provincia = provincia;
	}
	
	//Clase constructora con el parametro provincia con "Jujuy" como valor por defecto
	
	public Persona(int dni, LocalDate fechaNacimiento, String nombre) {
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.provincia = "Jujuy";
	}
	
	//getters y setters de cada atributo

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//Clase que calcula la edad
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear()-this.fechaNacimiento.getYear();
		int mes = fechaActual.getMonthValue();
		int dia = fechaActual.getDayOfMonth();
		int mesNacimiento = fechaNacimiento.getMonthValue();
		int diaNacimiento = fechaNacimiento.getDayOfMonth();
		if(mes<mesNacimiento || mes==mesNacimiento && dia<diaNacimiento) {
			edad=edad-1;
		}
		return edad;
	}
	
	public boolean mayoriaEdad() {
		int edad = calcularEdad();
		return edad>18;
	}
	
	public void mostrar () {
		String datos="Nombre: "+nombre+" DNI: "+dni+" Fecha de Nacimiento: "+fechaNacimiento+" Provincia: "+provincia;
		if (mayoriaEdad()==true) {
			datos= datos+" Es mayor de edad";
		}
		else {
			datos= datos+" Es menor de edad";
		}
		System.out.println(datos);
	}
}
