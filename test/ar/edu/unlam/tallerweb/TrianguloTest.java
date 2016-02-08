package ar.edu.unlam.tallerweb;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {
	
	@Test
	public void calcularPedrimetroTriangulo(){
		Triangulo miTriangulo = new Triangulo(2.0,3.0,2.0);
		Double valorEsperado = 7.0;
		Double actual = miTriangulo.calcularPerimetroDelTriangulo();
		assertEquals(valorEsperado.doubleValue(), actual.doubleValue(), 0.01);
		
	}
	
	@Test
	public void calcularAreaTriangulo(){
		Triangulo miTriangulo = new Triangulo(5.0,3.0,7.0);
		Double valorEsperado = 6.49;
		Double actual = miTriangulo.calcularAreaDelTriangulo();
		assertEquals(valorEsperado.doubleValue(), actual.doubleValue(), 0.01);
		
	}
	
	@Test
	public void calcularPedrimetroTrianguloFalle(){
		Triangulo miTriangulo = new Triangulo(5.0,5.0,5.0);
		Double valorEsperado = 16.0;
		Double actual = miTriangulo.calcularPerimetroDelTriangulo();
		assertNotEquals(valorEsperado.doubleValue(), actual.doubleValue(), 0.01);
		
	}
	
	@Test
	public void calcularAreaTrianguloFalle(){
		Triangulo miTriangulo = new Triangulo(5.0,3.0,7.0);
		Double valorEsperado = 7.00;
		Double actual = miTriangulo.calcularAreaDelTriangulo();
		assertNotEquals(valorEsperado.doubleValue(), actual.doubleValue(), 0.01);
		
	}
	
}
