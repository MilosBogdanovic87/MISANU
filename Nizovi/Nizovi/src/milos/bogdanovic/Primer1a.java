package milos.bogdanovic;

import java.util.Scanner;

public class Primer1a {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		// Rezervisanje prostora za niz od n članova
		int x[] = new int[n];
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
			System.out.println();
		}
		// Štampanje članove niza
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + ", ");
		ulaz.close();
		System.out.println();
	}
}