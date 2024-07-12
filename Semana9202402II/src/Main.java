import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listString = new ArrayList<String>();
		Boolean seguir = Boolean.TRUE;
		String palabra;
		String exit = "salir";
		while (seguir) {
			palabra = JOptionPane.showInputDialog("Digite una palabra");
			if (palabra.toLowerCase().equals(exit)) {
				seguir = false;
			} else {
				listString.add(palabra);
			}
		}

		if (!listString.isEmpty()) {
			for (String elemento : listString) {
				elemento = "El valor que quiero" + elemento + "\n";
				JOptionPane.showMessageDialog(null, elemento);

			}

		} else {
			JOptionPane.showMessageDialog(null, "Esta vacia");

		}
		String contenido = "";
		if (listString.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Esta vacia");

		} else {
			for (String elemento : listString) {
				contenido = contenido + elemento + "\n";
			}
			JOptionPane.showMessageDialog(null, contenido);

		}

		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion"));
		listString.remove(posicion);
		contenido = "";

		for (String elemento : listString) {
			contenido = contenido + elemento + "\n";
		}
		JOptionPane.showMessageDialog(null, contenido);

		for (String valor : listString) {
			if (valor.toUpperCase().equals("CASA")) {
				listString.remove(valor);
				break;
			}
		}

		contenido = "";

		for (String elemento : listString) {
			contenido = contenido + elemento + "\n";
		}
		JOptionPane.showMessageDialog(null, contenido);
	}

}
