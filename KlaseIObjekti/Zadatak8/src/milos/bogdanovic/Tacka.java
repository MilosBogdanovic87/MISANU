package milos.bogdanovic;

public class Tacka {
	
	private double a;
	private double b;
	private double rastojanje;
	
	Tacka(){
	}
	
	Tacka(double aa){
		a = aa;
	}
	
	Tacka(double aa, double bb){
		a = aa;
		b = bb;
	}
	
	public void kreirajTacku() {
		System.out.println("Koordinatna tacka je: " + a + ", " + b);
	}
	
	public double rastojanje() {
		return Math.sqrt(a * a + b * b);
	}
	public double rastojanjeOdZadate(Tacka t) {
		return Math.sqrt(a)
	}
	
	

}
