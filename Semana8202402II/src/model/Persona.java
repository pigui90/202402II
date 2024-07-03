package model;

import java.util.Date;

public class Persona {
	String identificacion;
	int edad;
	Date fechaNacimiento;
	String residencia;
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	
	
	public Boolean esMayor(int a, int b) {
		return a > b;
	}
	
	public Boolean esMenor(int a, int b) {
		return a < b;
	}
}
