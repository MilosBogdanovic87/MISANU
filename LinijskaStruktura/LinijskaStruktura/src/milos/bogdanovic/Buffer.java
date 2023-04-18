package milos.bogdanovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
	public static void main(String[] args) throws Exception {
		double x;
// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za X: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("X je: " + x);
	}
}