package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;


import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int clasePizza=1;
		while(clasePizza<=3) {
			System.out.println("Ingrese diametro de pizza "+clasePizza+" (entre 20, 30 o 40): ");
			int diametro = scanner.nextInt();
			while (diametro!=20 && diametro!=30 && diametro!=40) {
				System.out.println("Error solo puede ingresar los valores 20(Pizza chica), 30(Pizza mediana), y 40(Pizza grande)");
				System.out.println("Intentelo nuevamente: ");
				diametro = scanner.nextInt();
			}
			System.out.println("¿Desea Ingredientes Especiales? (responda true por si y false por no):");
			while (!scanner.hasNextBoolean()) {
				System.out.println("Error solo puede ingresar true por si, o false por no. Reintentelo:");
				scanner.next();
			}
			boolean ingredientesEspeciales = scanner.nextBoolean();
			Pizza pizza = new Pizza ();
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			pizza.CalcularArea();
			pizza.CalcularPrecio();
			System.out.println("**Pizza**");
			System.out.println("Diametro: "+diametro);
			System.out.println("Ingredientes Especiales: "+ingredientesEspeciales);
			System.out.println("Precio pizza: "+pizza.CalcularPrecio());
			System.out.println("Area de la pizza: "+pizza.CalcularArea());
			clasePizza++;
		}
		scanner.close();
	}
	
}
