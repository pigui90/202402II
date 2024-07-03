package model;

public class Profesion {
	int codigo;
	String nombre;
	String carrera;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Profesion [codigo=" + codigo + ", nombre=" + nombre + ", carrera=" + carrera + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Profesion profesion = (Profesion)obj;
		if(this.getCodigo() == profesion.getCodigo()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
