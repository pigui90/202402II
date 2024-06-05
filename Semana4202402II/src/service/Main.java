package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;
/**
 * clase main
 */
public class Main {

	/**
	 * Metodo main
	 * @param args parametros default
	 */
	public static void main(String[] args) {

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaHoy = new Date();

			JOptionPane.showMessageDialog(null, fechaHoy.toString());
			String fechaStr = simpleDateFormat.format(fechaHoy);
			JOptionPane.showMessageDialog(null, fechaStr);

			String fechaUsuario = JOptionPane.showInputDialog(null,
					"Indique una fecha, favor usar el formato dd/MM/yyyy");

			Date fechaUser = simpleDateFormat.parse(fechaUsuario);

			JOptionPane.showMessageDialog(null, fechaUser.toString());

			LocalDate ldFechaUser = fechaUser.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int diasSumar = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de dias"));
			ldFechaUser = ldFechaUser.plusDays(diasSumar);

			JOptionPane.showMessageDialog(null, ldFechaUser.toString());
			
			Date fechaLD = Date.from(ldFechaUser.atStartOfDay(ZoneId.systemDefault()).toInstant());
			
			JOptionPane.showMessageDialog(null, fechaLD.toString());
			String fechaLDStr = simpleDateFormat.format(fechaLD);
			JOptionPane.showMessageDialog(null, fechaLDStr);

			BigDecimal salario = new BigDecimal(100000);
			BigDecimal renta = new BigDecimal(0.03);
			BigDecimal anualidad = new BigDecimal(5.5);
			BigDecimal salarioNeto = BigDecimal.ZERO;
			
			salarioNeto = salarioNeto.add(salario);
			salarioNeto = salarioNeto.subtract(renta);
			salarioNeto = salarioNeto.multiply(anualidad, MathContext.DECIMAL32);
			
			JOptionPane.showMessageDialog(null, salarioNeto);


		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al convertir el String a Date", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
