package model;

public class Cuadrado extends Poligono {
	
	int medidaLado;
	
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(int cantidadLados, int medidaLado){
		super(cantidadLados);
		this.medidaLado = medidaLado;
	}

	public int getMedidaLado() {
		return medidaLado;
	}

	public void setMedidaLado(int medidaLado) {
		this.medidaLado = medidaLado;
	}

	@Override
	public String toString() {
		return "Cuadrado [medidaLado=" + medidaLado + "]";
	}
	
	@Override
	public double calcularArea() {
		return (double) medidaLado * medidaLado;
	}
	
	@Override
	public double calcularPerimetro() {
		return (double) medidaLado * cantLados;
	}
	
	
	

}
