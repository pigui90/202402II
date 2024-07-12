package service;

import javax.swing.JOptionPane;

import model.Cuadrado;
import model.Poligono;
import model.Rectangulo;
import model.Triangulo;

public class Main {

	public static void main(String[] args) {

		Poligono poligono = new Poligono();
		poligono.setCantLados(4);

		Poligono poligono2 = new Poligono(3);

		JOptionPane.showMessageDialog(null, poligono.calcularArea());

		JOptionPane.showMessageDialog(null, poligono2.calcularPerimetro());

		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setCantLados(4);
		cuadrado.setMedidaLado(5);

		Rectangulo rectangulo = new Rectangulo(poligono.getCantLados(), 6, 8);

		Triangulo triangulo = new Triangulo(3, 6, 8, 4, 6, 8);

		Triangulo triangulo2 = new Triangulo();
		triangulo2.setAltura(7);
		triangulo2.setBase(6);
		triangulo2.setCantLados(poligono2.getCantLados());
		triangulo2.setMedidaLado1(7);
		triangulo2.setMedidaLado2(4);
		triangulo2.setMedidaLado3(6);

		JOptionPane.showMessageDialog(null, cuadrado.calcularArea());

		JOptionPane.showMessageDialog(null, triangulo.calcularPerimetro());
		JOptionPane.showMessageDialog(null, rectangulo.calcularPerimetro());

	}

}
