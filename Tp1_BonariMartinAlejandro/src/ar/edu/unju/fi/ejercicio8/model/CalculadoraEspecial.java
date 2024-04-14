package ar.edu.unju.fi.ejercicio8.model;


public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
	
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double CalcularSumatoria() {
		double sumatoria=0;
		int k;
		for (k=1;k<=n;k++) {
			sumatoria=sumatoria+Math.pow(((k*(k+1))/2), 2.00);
		}
		return sumatoria;
	}
	
	public double CalcularProductoria() {
		double productoria=1;
		int k;
		for (k=1;k<=n;k++) {
			productoria=productoria*(k*(k+4));
		}
		return productoria;
	}
}
