package model;

public class Triangulo extends Poligono{
	int base;
	int altura;
	int medidaLado1;
	int medidaLado2;
	int medidaLado3;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(int cantidadLados, int base, int altura, int medida1, int medida2, int medida3) {
		super(cantidadLados);
		this.base = base;
		this.altura = altura;
		this.medidaLado1 = medida1;
		this.medidaLado2 = medida2;
		this.medidaLado3 = medida3;
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

	public int getMedidaLado1() {
		return medidaLado1;
	}

	public void setMedidaLado1(int medidaLado1) {
		this.medidaLado1 = medidaLado1;
	}

	public int getMedidaLado2() {
		return medidaLado2;
	}

	public void setMedidaLado2(int medidaLado2) {
		this.medidaLado2 = medidaLado2;
	}

	public int getMedidaLado3() {
		return medidaLado3;
	}

	public void setMedidaLado3(int medidaLado3) {
		this.medidaLado3 = medidaLado3;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", medidaLado1=" + medidaLado1 + ", medidaLado2="
				+ medidaLado2 + ", medidaLado3=" + medidaLado3 + "]";
	}
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return medidaLado1 + medidaLado2 + medidaLado3;
	}
	
	
	
}
