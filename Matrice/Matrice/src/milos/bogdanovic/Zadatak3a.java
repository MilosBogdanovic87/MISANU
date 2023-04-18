package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("KOliko redova ");
		int red = sc.nextInt();
		System.out.println("Koliko kolona ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Unesite clanove niza ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]= ");
				niz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if ((i + 1) % 2
				if ((i + 1) % 2 == 0 && i != 0) // red
					System.out.print(niz[i][j] + " ");
			}

			System.out.println();
		}

	}
}
