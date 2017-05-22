package figuras;

public abstract class Figura {
	
	//Atributos
	private String tipo;
	private double dx;
	private double dy;
	
	
	//Métodos contrutores
	public Figura() {
		this.dx = 0;
		this.dy = 0;
	}
	
	public Figura(String tipo, double dx, double dy) {
		this.tipo = tipo;
		this.dx = dx;
		this.dy = dy;
	}
	
	
	//Métodos operacionais
	public abstract String desenhar();
	
	public abstract double calcularArea();
	
	public void mover(float x, float y) {
		this.dx += x;
		this.dy += y;
	}
	
	
	
	
	public String toString() {
		return String.format("Tipo: %s\nPosicao atual: x = %0.2f | y = %0.2f", getTipo(), getX(), getY());
	}

	
	//Getters e Setters
	public String getTipo() {
		return tipo;
	}

	public double getX() {
		return dx;
	}

	public double getY() {
		return dy;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setX(double dx) {
		this.dx = dx;
	}

	public void setY(double dy) {
		this.dy = dy;
	}

	
}
