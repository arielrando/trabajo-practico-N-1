package ar.edu.unlam.tallerweb;

public class Triangulo {

	private Double lado1;
	private Double lado2;
	private Double ladoBase;
	private Double semiperimetro;
	private Double area;
	
	
	public Triangulo (Double lado1, Double lado2, Double ladoBase) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.ladoBase = ladoBase;
		
		
	}
	
	public Double calcularPerimetroDelTriangulo () {
		
		return this.lado1+this.lado2+this.ladoBase;
		
	}
	
	public Double calcularAreaDelTriangulo () {
		
		semiperimetro = (lado1+lado2+ladoBase)/2.0;
		
		area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-ladoBase));
		
		return area;
		
		
	}
}
