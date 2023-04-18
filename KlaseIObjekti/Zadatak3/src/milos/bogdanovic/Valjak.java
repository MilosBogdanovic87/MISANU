package milos.bogdanovic;

public class Valjak {
	
	private double visina;
	private double poluprecnik;
	
	Valjak(double v, double p){
		visina = v;
		poluprecnik = p;
	}
	
	public double getVisina() {
		return visina;
	}
	
	public double getPoluprecnik() {
		return poluprecnik;
	}
	
	double Zapremina() {
		return 3.14 * poluprecnik * poluprecnik * visina;
	}
	
	void opis() {
		System.out.println("Valjak visine: " + visina + " i poluprecnika: "  + poluprecnik + " ima zapreminu: " + Zapremina());
	}

}
