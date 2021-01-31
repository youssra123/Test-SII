package sii.maroc;

public class Diesel {
	private double consomation=0.05;
	private double kilometrage;

	public Diesel(double kilometrage) {
	
		this.kilometrage = kilometrage;
	}
	
	public double CalculeConsomation() {
		return this.kilometrage*this.consomation;
	}
}
