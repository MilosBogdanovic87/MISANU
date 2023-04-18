package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite koliko redova zelite: ");
		int red = sc.nextInt();
		System.out.print("Unesite koliko kolona zelite: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];
		int niz1[][] = new int[red][kolona];
		int suma = 0;

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]= ");
				niz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Clanovi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + "\t ");
			}
			System.out.println();
		}

		System.out.println("Negativni clanovi su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] < 0)
					System.out.print(niz[i][j] + "\t ");
			}
			System.out.println();
		}
		// Suma negativnih
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] < 0)

					suma = suma + niz[i][j];

			}

			System.out.println();
		}

		System.out.println("suma negativnih elemenata je:  " + suma);

	}
}
