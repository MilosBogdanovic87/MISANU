package milos.bogdanovic;

public class Radnik {
	
	private String ime;
	private double procenat;
	private double prihod;
	
	Radnik(String i, double p, double pr){
		ime = i;
		procenat = p;
		prihod = pr;
	}
	
	double obracunPlate() {
		return (procenat / 100) * prihod;
	}
	
	public double getPrihod() {
		return prihod;
	}
	
	void opis() {
		System.out.println("Plata radnika: " + ime + " iznosi: " + obracunPlate());
	}

}
