package figuras;

import interfaces.*;

public class Quadrado extends Figura implements FiguraColorida {
	
	//Atributos
	private double lado;
	private String cor;
	
	
	//Métodos construtores
	public Quadrado(String tipo, double dx, double dy, double lado) {
		super(tipo, dx, dy);
		this.lado = lado;
	}
	
	
	//Método construtor com cor
	public Quadrado(String tipo, double dx, double dy, double lado, String cor) {
		super(tipo, dx, dy);
		this.lado = lado;
		setCor(cor);
	}
	
	
	//Métodos operacionais
	
	public String desenhar() {
		return String.format("Quadrado");
	}
	
	//Método mover() ja herdado
	
	@Override
	public double calcularArea() {
		double l = this.lado;
		
		return l*l;
	}


	// Getters e Setters
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
}
