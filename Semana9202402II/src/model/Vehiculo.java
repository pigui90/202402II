package model;

public class Vehiculo {
	String placa;
	String modelo;
	int anio;
	public Vehiculo(String placa, String modelo, int anio) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.anio = anio;
	}
	public Vehiculo() {
		super();
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return String.format("Vehiculo [placa=%s, modelo=%s, anio=%s]", placa, modelo, anio);
	}
	
	
}
