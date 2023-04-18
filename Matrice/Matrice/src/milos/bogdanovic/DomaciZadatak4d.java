package milos.bogdanovic;

import java.util.Scanner;

public class DomaciZadatak4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Koliko redova zelite: ");
		int red = sc.nextInt();

		System.out.print("Koliko kolona zelite: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];
		int c2[][] = new int[red][kolona];
		int skalar;

		System.out.print("Unesite skalar: ");
		skalar = sc.nextInt();

		System.out.println("Unesite elemente matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]= ");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Unesite elemente matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + ", " + j + "]= ");
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + "\t ");
			}
			System.out.println();
		}

		System.out.println("Elementi matrice b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + "\t ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c[i][j] = skalar * a[i][j];
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c2[i][j] = skalar * b[i][j];
			}
		}
		System.out.println("Proizvod matrice [a] i skalara [" + skalar + "] je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c[i][j] + "\t ");
			}
			System.out.println();
		}

		System.out.println("Proizvod matrice [b] i skalara [" + skalar + "] je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c2[i][j] + "\t ");
			}
			System.out.println();

		}

	}
}
