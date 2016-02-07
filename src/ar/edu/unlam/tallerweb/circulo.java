package ar.edu.unlam.tallerweb;

public class circulo {
	
	private Double radio;
	private Double pi = 3.14;
	
	public circulo(Double radio, Double pi){
		this.radio = radio;
		
	}
	
	public Double calcularPerimetroCirculo(){
		
		return 2 * pi * this.radio;
	}
	
	public Double calcularAreaCirculo(){
		
		return pi * Math.pow(this.radio, 2);
		
	}
}
