package model;

import javax.swing.JOptionPane;

public class EstrategiaAvanzada implements Estrategia{

	@Override
	public void calcularImpuestos() {
		
		JOptionPane.showMessageDialog(null, "Avanzada");
		JOptionPane.showMessageDialog(null, "Se va a calcular un 30%");
		JOptionPane.showMessageDialog(null, "Se rebajo del 5% por cada hijo");
		JOptionPane.showMessageDialog(null, "Se rebajo del 2% por cada casa");

	}

}
