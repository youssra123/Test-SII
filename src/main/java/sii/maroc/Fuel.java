package sii.maroc;

public class Fuel {
	private double consomation=0.06;
	private double kilometrage;

	public Fuel(double kilometrage) {
	
		this.kilometrage = kilometrage;
	}
	
	public double CalculeConsomation() {
		return this.kilometrage*this.consomation;
	}
}
