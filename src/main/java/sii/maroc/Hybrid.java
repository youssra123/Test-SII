package sii.maroc;

public class Hybrid {
	private double consomation=0.03;
	private double kilometrage;

	public Hybrid(double kilometrage) {
	
		this.kilometrage = kilometrage;
	}
	
	public double CalculeConsomation() {
		return this.kilometrage*this.consomation;
	}
}
