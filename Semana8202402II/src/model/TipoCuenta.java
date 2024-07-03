package model;

public class TipoCuenta {
	String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Tipo de cuenta: " + descripcion;
	}
}
