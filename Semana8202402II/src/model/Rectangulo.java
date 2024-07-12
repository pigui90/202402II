package model;

public class Rectangulo extends Poligono {
	int base;
	int altura;

	public Rectangulo() {
		super();
	}
	
	public Rectangulo(int cantidadLados, int base, int altura) {
		super(cantidadLados);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return String.format("Rectangulo [base=%s, altura=%s]", base, altura);
	}
	
	@Override
	public double calcularArea() {
		return (double)base + altura;
	}
	
	@Override
	public double calcularPerimetro() {
		return (double) base * 2 + altura * 2;
	}
	
//	@Override
//	public double calcularPerimetro() {
//		// TODO Auto-generated method stub
//		return super.calcularPerimetro();
//	}
	
	
}
