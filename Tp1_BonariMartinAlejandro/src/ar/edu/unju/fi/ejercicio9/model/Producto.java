package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	public Producto (){ //constructor vacio
	}
	//getters y setters
	public String getNombre () {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getCodigo () {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public double getPrecio () {
		return precio;
	}
	public void setPrecion(double precio) {
		this.precio=precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento=descuento;
	}
	
	public double CalcularDescuento() {
		double montoDescuento=0;
		double auxiliar;
		double precioDescuento;
		if (descuento>=0) {
			auxiliar=(double)descuento/100;
			montoDescuento=precio*auxiliar;
			precioDescuento=precio-montoDescuento;
		}
		precioDescuento=precio-montoDescuento;
		return precioDescuento;
	}
}
