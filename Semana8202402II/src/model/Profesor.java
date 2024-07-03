package model;

import java.util.Date;

public class Profesor {
	int idProfesor;
	int identificacion;
	String nombre;
	Date fechaIngreso;
	public int getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [idProfesor=").append(idProfesor).append(", identificacion=").append(identificacion)
				.append(", nombre=").append(nombre).append(", fechaIngreso=").append(fechaIngreso).append("]");
		return builder.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Profesor profesor = (Profesor)obj;
		return this.getIdentificacion()==profesor.getIdentificacion();
			
	}
}
