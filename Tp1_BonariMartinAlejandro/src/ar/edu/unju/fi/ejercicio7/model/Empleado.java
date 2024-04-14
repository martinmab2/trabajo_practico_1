package ar.edu.unju.fi.ejercicio7.model;
public class Empleado {
	private String nombre;
	private long legajo;
	private double salario;
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO = 20000.00;
	
	public Empleado (String nombre, long legajo, double salario){
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario>=SALARIO_MINIMO) {
			this.salario = salario;
		}
		else {
			this.salario = SALARIO_MINIMO;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getLegajo() {
		return legajo;
	}
	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void mostrarDatos() {
		System.out.println("Salario del empleado: "+salario);
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo del empleado: "+legajo);
	}
	public void aumentoSalarial () {
		salario=salario+AUMENTO;
	}
}
