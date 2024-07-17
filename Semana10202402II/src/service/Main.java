package service;

import javax.swing.JOptionPane;

import model.Contexto;
import model.EstrategiaAvanzada;
import model.EstrategiaNormal;
import model.Servidor;

public class Main {

	public static void main(String[] args) {
		
		Servidor servidor1 = Servidor.getServer();
		
		JOptionPane.showMessageDialog(null, servidor1.getIp() + "\n" + servidor1.getUrl());
		
		Servidor servidor2 = Servidor.getServer();
		
		JOptionPane.showMessageDialog(null, Servidor.getIp() + "\n" + Servidor.getUrl());

		Contexto contexto = new Contexto(new EstrategiaNormal());
		
		EstrategiaAvanzada estrategiaAvanzada = new EstrategiaAvanzada();  
		Contexto contexto2 = new Contexto(estrategiaAvanzada);
		
		contexto.calcularImpuestos();
		
		contexto2.calcularImpuestos();

	}

}
