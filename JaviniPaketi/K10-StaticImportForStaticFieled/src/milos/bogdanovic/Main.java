package milos.bogdanovic;

import static java.lang.Math.PI;

public class Main {
	
	public static void main (String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		double r, a;
		
		System.out.println("Unesite poluprecnik: ");
		r = sc.nextDouble();
		
		a = PI * r * r;
		System.out.println("Povrsina kruga: " + a);
		
		
	}

}
