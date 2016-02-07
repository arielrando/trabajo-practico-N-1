package ar.edu.unlam.tallerweb;

public class Circulo {
	
	private Double radio;
	private Double pi = 3.14;
	
	public Circulo(Double radio){
		this.radio = radio;
		
	}
	
	public Double calcularPerimetroCirculo(){
		
		return 2 * pi * this.radio;
	}
	
	public Double calcularAreaCirculo(){
		
		return pi * Math.pow(this.radio, 2);
		
	}
}
