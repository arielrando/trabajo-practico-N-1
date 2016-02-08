package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void calcularPerimetroDelCirculoTest (){
		
		Circulo miCirculo = new Circulo (5.0);
		
		Double esperado = 31.4;
		
		Double actual = miCirculo.calcularPerimetroCirculo();
		
		assertEquals (esperado.doubleValue(),actual.doubleValue(),0.01);
		
	}
	
	@Test
	public void calcularAreaDelCirculo () {
		
		Circulo miCirculo = new Circulo (5.0);
		
		Double esperado = 78.5;
		
		Double actual = miCirculo.calcularAreaCirculo();
		
		assertEquals (esperado.doubleValue(),actual.doubleValue(),0.01); 
		
	}
	
	@Test
	public void calcularPerimetroDelCirculoTestFallo (){
		
		Circulo miCirculo = new Circulo (5.0);
		
		Double esperado = 36.0;
		
		Double actual = miCirculo.calcularPerimetroCirculo();
		
		assertNotEquals (esperado.doubleValue(),actual.doubleValue());
		
	}
	
	@Test
	public void calcularAreaDelCirculoFallo () {
		
		Circulo miCirculo = new Circulo (5.0);
		
		Double esperado = 80.0;
		
		Double actual = miCirculo.calcularAreaCirculo();
		
		assertNotEquals (esperado.doubleValue(),actual.doubleValue()); 
		
	}
	
}