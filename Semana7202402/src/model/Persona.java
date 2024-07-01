package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
	String identificacion;
	int edad;
	Date fechaNacimiento;
	String residencia;

	public Persona() {
		super();
	}

	public Persona(String identificacion, int edad, Date fechaNacimiento, String residencia) {
		this.identificacion = identificacion;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.residencia = residencia;
	}

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

	public String getResindencia() {
		return residencia;
	}

	public void setResindencia(String residencia) {
		this.residencia = residencia;
	}

	public String mostrarDatosPersona() {
		return this.getResindencia() + " \n" + this.getEdad();
	}

//	@Override
//	public String toString() {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
//
//		// TODO Auto-generated method stub
//		return "Identificacion: " + getIdentificacion() + "\n" + "Fecha Nacimiento: " + sdf.format(fechaNacimiento);
//	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persona f = (Persona) obj;
		if (f.getIdentificacion() == this.getIdentificacion()) {
			return true;
		} else {
			return false;
		}

	}
	

}
