package test;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Persona;

public class Prueba1 {
	
	static Persona persona;
	static int a;
	static int b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		persona = new Persona();
		a = 0;
		b = 0;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		a = 0;
		b = 0;
	}

	@Before
	public void setUp() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo antes del test");
	}

	@After
	public void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo despues del test");

	}

	@Test
	public void test() {
		JOptionPane.showMessageDialog(null,"SUMA");

		a = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de b"));
		JOptionPane.showMessageDialog(null, "La suma es: " + (a+b));

	}
	
	@Test
	public void testResta() {
		JOptionPane.showMessageDialog(null,"RESTA");

		a = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de b"));
		JOptionPane.showMessageDialog(null, "La resta es: " + (a-b));

	}
	
	@Test
	public void testDivision() {
		JOptionPane.showMessageDialog(null,"DIVISION");
		a = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de b"));
		JOptionPane.showMessageDialog(null, "La division es: " + (a/b));

	}
	
	@Test
	public void testMayor() {
		JOptionPane.showMessageDialog(null,"MAYOR");
		a = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de b"));
		assertTrue(persona.esMayor(a, b));
	}
	
	@Test
	public void testMenor() {
		JOptionPane.showMessageDialog(null,"MENOR");
		a = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digame el valor de b"));
		assertTrue("El numero a NO es menor que b", persona.esMenor(a, b));
	}
	
}
