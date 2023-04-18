package milos.bogdanovic;

public class Domine {
	
	private int a;
	private int b;
	private int c;
	private int d;
	private int pom;
	
	Domine(){
		a = 1;
		b = 1;
		c = 1;
		d = 1;
	}
	
	int getA() {
		return a;
	}
	
	int getB() {
		return b;
	}
	
	void zamena() {
		int pom = a;
		a = b;
		b = pom;
		
		
		System.out.println("Posle zamene: " + a + " " + b);
	}
	
	void jednakost() {
		if (a == c || b == d) {
			System.out.println("Jednake");
		}
	}

}
