package main;

import figuras.*;

public class TesteFigura {
	
	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado("Quadrado", 0, 0, 5);
		Quadrado quadrado2 = new Quadrado("Quadrado", 15, 15, 7);
//		Circulo circulo1 = new Circulo("Circulo", 0, 0, 10);
		Circulo circulo2 = new Circulo("Circulo", 20, 20, 15);
		
//		Figura quadrado3 = new Quadrado("Quadrado", 0, 0, 10);
		
		System.out.println(quadrado1.getLado());
		System.out.println(quadrado1.desenhar());
		System.out.println(quadrado1.calcularArea());
//		System.out.println("Raio do círculo 1:" circulo1.getRaio());
		System.out.println(circulo2.calcularArea());
		quadrado2.mover(30, 30);
		System.out.println(quadrado2.getX());
		System.out.println(quadrado2.getY());
		quadrado2.setCor("Vermelho");
		System.out.println(quadrado2.getCor());
		

	}
	

}
