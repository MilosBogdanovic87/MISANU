package milos.bogdanovic;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite visinu h: ");
		double h = input.nextInt();
		System.out.print("Unesite tezinu m: ");
		double m = input.nextInt();
		
		double BMI;
		BMI = m / (h * h);
		

	
		System.out.println("BMI " + BMI);
	}
}
