package model;

public class Poligono {
	int cantLados;

	public int getCantLados() {
		return cantLados;
	}

	public void setCantLados(int cantLados) {
		this.cantLados = cantLados;
	}

	public Poligono(int cantLados) {
		super();
		this.cantLados = cantLados;
	}

	public Poligono() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Poligono [cantLados=").append(cantLados).append("]");
		return builder.toString();
	}
	
	public double calcularArea() {
		return 0.0;
	}
	
	public double calcularPerimetro() {
		return 0.0;
	}
	
	
}
