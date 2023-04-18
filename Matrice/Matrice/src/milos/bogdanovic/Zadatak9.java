package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova matrice: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Unesite elemente matrice.");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Matrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Posle zamene: ");
		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				if (i == j || (i - 1) == (j + 1))
					System.out.print(niz[i][j] + " ");
			}

			System.out.println();
		}
		sc.close();
	}
}