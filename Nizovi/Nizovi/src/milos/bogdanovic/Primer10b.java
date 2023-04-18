package milos.bogdanovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer10b {
	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Kreiranje celobrojnog niza x
		int[] x = new int[100];

		// Unos vrednosti promenljive n
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");

		for (int i = 0; i < n; i++) { // PROBA***************************************************
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}

		// Određivanje minimalnog i maksimalnog elementa niza
		int min, max;
		min = max = x[0]; // *******PROBA OVO SE MENJA*************************************************

		for (int i = 1; i < n; i++) { // *******PROBA***************************************************
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		// Štampanje rezultata
		System.out.println("Maksimalni element je " + max + "\nMinimalni element je " + min);
	}
}