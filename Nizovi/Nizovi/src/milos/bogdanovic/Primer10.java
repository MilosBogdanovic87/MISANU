/* 
Primer 10: 
Sastaviti algoritam i napisati program kojim se određuje maksimalni i minimalni element 
u celobrojnom nizu X od N elemenata. */

package milos.bogdanovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer10 {
	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Kreiranje celobrojnog niza x
		int[] x = new int[100];

		// Unos vrednosti promenljive n
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");

		for (int i = 1; i <= n; i++) { // OVAJ DEO NIJE JASAN********************************
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}

		// Određivanje minimalnog i maksimalnog elementa niza
		int min, max;
		min = max = x[1]; // *****************************************

		for (int i = 2; i <= n; i++) { // OVAJ DEO NIJE JASAN**************************************
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		// Štampanje rezultata
		System.out.println("Maksimalni element je " + max + "\nMinimalni element je " + min);
	}
}