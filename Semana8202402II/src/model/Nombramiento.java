package model;

import java.util.Date;

import javax.swing.JOptionPane;

public class Nombramiento {
	Profesor profesor;
	int idNombramiento;
	String codigo;
	String plaza;
	Date fechaDesde;
	Date fechaHasta;
	int cantidadaHorasOcupadas;
	int jornada;
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public int getIdNombramiento() {
		return idNombramiento;
	}
	public void setIdNombramiento(int idNombramiento) {
		this.idNombramiento = idNombramiento;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPlaza() {
		return plaza;
	}
	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public int getCantidadaHorasOcupadas() {
		return cantidadaHorasOcupadas;
	}
	public void setCantidadaHorasOcupadas(int cantidadaHorasOcupadas) {
		this.cantidadaHorasOcupadas = cantidadaHorasOcupadas;
	}
	public int getJornada() {
		return jornada;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombramiento [profesor=").append(profesor).append(", idNombramiento=").append(idNombramiento)
				.append(", codigo=").append(codigo).append(", plaza=").append(plaza).append(", fechaDesde=")
				.append(fechaDesde).append(", fechaHasta=").append(fechaHasta).append(", cantidadaHorasOcupadas=")
				.append(cantidadaHorasOcupadas).append(", jornada=").append(jornada).append("]");
		return builder.toString();
	}
	
	public void mostrarNombramientosProfesor(Profesor profesor) {
		Nombramiento[] nombramientos = new Nombramiento[5];
		
		for (int i = 0; i < nombramientos.length; i++) {
			if(nombramientos[i].getProfesor().equals(profesor)) {
				JOptionPane.showMessageDialog(null, nombramientos[i].toString());
			}
		}
				
	}
	
}
