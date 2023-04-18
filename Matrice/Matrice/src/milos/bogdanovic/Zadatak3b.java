package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak3b {

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
				System.out.print("a[" + i + ", " + j + "]= ");
				niz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((j - 1) % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}

			System.out.println();
		}

	}
}
