package milos.bogdanovic;

public class Matrica {
	
	
	
	private double niz[][];
	
	Matrica(int red, int kolona){

		this.niz = new double[red][kolona];
	}
	
	
	
	public double getelementi( int red, int kolona) {
		return niz.length;
	}
	
	public double vrsta() {
		return niz[0].length;
	}
	
	public double kolona() {
		return niz.length;
	}
	
	public void setElementi(int red, int kolona, double broj) {
		this.niz[red][kolona] = broj;
	}
	
	public Matrica postavi(int v, int k, double vr) {
		//if(v > 0 || k > 0)
		niz[v][k] = vr;
		return this;
	}
	
	public double getDohvati(int v, int k) {
		return niz[v][k];
	}
	
	public String toString() {
		String s = "";
		for(int v = 0; v < niz.length; v++) {
			for(int k = 0; k < niz[0].length; k++) {
				System.out.print(niz[v][k] + "\n ");
				s = s + "\n";
			}
		
		}
		return s;
	}
	
	
	
	

}
