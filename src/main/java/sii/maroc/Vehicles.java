package sii.maroc;

import java.text.DecimalFormat;
import java.util.List;

public class Vehicles {
	private String vehicleInfo;
	private boolean blocked=false;

	public Vehicles(String vehicleInfo) {
		this.vehicleInfo=vehicleInfo;
	}

	public String move(String typeVehicle, String carburant, String chemin, String kilometrage) {
		
	
		double consomation=0;
		String str=kilometrage.split(" KM")[0];
		double kilometre=Double.parseDouble(str);
		if(carburant.equalsIgnoreCase("Diesel")) consomation=(new Diesel(kilometre)).CalculeConsomation();
		if(carburant.equalsIgnoreCase("Fuel")) consomation=(new Fuel(kilometre)).CalculeConsomation();
		if(carburant.equalsIgnoreCase("Hybrid")) consomation=(new Hybrid(kilometre)).CalculeConsomation();
		DecimalFormat consommationFormat=new DecimalFormat("0.00");
		String consommationString=String.format( "%.2f", consomation);
		String cheminResult=VerifChemin(chemin);
		if(this.blocked) return cheminResult;

		return VerifChemin(chemin)+" The "+typeVehicle+" will consume "+consommationString+" L";
	}
	public String VerifChemin(String chemin) {
		if(chemin.contains("1 3") ) {
			this.blocked=true;
			return "DOORS KO, BLOCKED \n"+
                "  _\n"+
                " | \\\n"+
                " |_|";}
		else if(chemin.contains("2 4") ) {this.blocked=true;
			return "DOORS KO, BLOCKED \n"+
                "  _\n"+
                " | |\n"+
                " /_|";}
		else return "DOORS OK, MOVING.";
	
		
		
	}

}
