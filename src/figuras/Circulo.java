package figuras;

import interfaces.*;

public class Circulo extends Figura implements FiguraColorida {
	
	//Atributos
	private double raio;
	private String cor;
	
	
	//Método construtor
	public Circulo(String tipo, double dx, double dy, double raio) {
		super(tipo, dx, dy);
		this.raio = raio;
	}
	
	
	//Método construtor com cor
	public Circulo(String tipo, double dx, double dy, double raio, String cor) {
		super(tipo, dx, dy);
		this.raio = raio;
		setCor(cor);
	}
	
	
	//Métodos operacionais
	
	public String desenhar() {
		return String.format("Circulo");
	}
	
	//Método mover já herdado
	
	@Override
	public double calcularArea() {
		double r = this.raio;
		
		return r*r*3.14159;
	}


	//Getters e Setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
}
