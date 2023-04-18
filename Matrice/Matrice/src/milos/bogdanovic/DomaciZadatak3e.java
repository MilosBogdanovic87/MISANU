package milos.bogdanovic;

import java.util.Scanner;

public class DomaciZadatak3e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite koliko redova zelite: ");
		int red = sc.nextInt();
		System.out.print("Unesite koliko kolona zelite: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

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

		System.out.println("Clanovi niza sa parnim indeskom kolona i redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((j - 1) % 2 == 0 && (i + 1) % 2 == 0) // kolona i red
					System.out.print(niz[i][j] + "\t ");

			}

			System.out.println();
		}

	}
}
