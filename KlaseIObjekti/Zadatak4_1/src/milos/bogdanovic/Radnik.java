package milos.bogdanovic;

public class Radnik {
	
	private String ime;
	private double prihod;
	private double procenat;
	
	Radnik(String ime, double prihod, double procenat){
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
	}
	
	public double getPrihod() {
		return prihod;
	}
	
	public double obracunPlate() {
		 return prihod * (procenat / 100);
	}
	
	public String opis() {
		return ime + "/" + obracunPlate();
	}
	
	public void drugiOpis() {
		System.out.println(ime + "/" + obracunPlate());
	}

}
