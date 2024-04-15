package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int claseProducto=1;
		while(claseProducto<=3) {
			//carga de datos
			System.out.println("Ingrese nombre del producto"+claseProducto+": ");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese codigo del producto"+claseProducto+": ");
			String codigo = scanner.nextLine();
			System.out.println("Cargue el precio del producto"+claseProducto+": ");
			double precio = scanner.nextDouble();
			System.out.println("Cargue el descuento del producto"+claseProducto+" en (porcentaje numero entero sin el simbolo %), (si el mismo no tiene coloque 0): ");
			int descuento = scanner.nextInt();
			//limpiar buffer
			scanner.nextLine();
			//creacion del nuevo producto
			Producto producto=new Producto();
			//seteo de los atributos
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecion(precio);
			producto.setDescuento(descuento);
			//llamada al metodo calculardescuento
			producto.CalcularDescuento();
			//muestreo de datos
			System.out.println("Producto "+claseProducto+": ");
			System.out.println("Nombre del producto: "+nombre);
			System.out.println("Codigo del producto: "+codigo);
			System.out.println("Precio del producto: "+precio+"$");
			System.out.println("Descuento: "+descuento+"%");
			System.out.println("Precio del producto con el descuento realizado: "+producto.CalcularDescuento()+"$");
			claseProducto++;
		}
		scanner.close();
	}
}