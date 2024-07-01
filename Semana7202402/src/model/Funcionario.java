package model;

import java.util.Date;

public class Funcionario extends Persona {
	private String lugarTrabajo;
	private String gradoAcademico;

	public Funcionario() {
		super();
	}

	public Funcionario(String lugarTrabajo, String gradoAcademico, String identificacion, int edad,
			Date fechaNacimiento, String residencia) {
		super(identificacion, edad, fechaNacimiento, residencia);
		this.lugarTrabajo = lugarTrabajo;
		this.gradoAcademico = gradoAcademico;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

//	@Override
//	public String mostrarDatosPersona() {
//		return super.mostrarDatosPersona();
//	}
//	
//	@Override
//	public String mostrarDatosPersona() {
//		return "lo modifique";
//	}

	@Override
	public String mostrarDatosPersona() {
		// TODO Auto-generated method stub
		return "Soy funcionario" + getLugarTrabajo() + "\n" + getGradoAcademico() + "\n" + super.mostrarDatosPersona();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
