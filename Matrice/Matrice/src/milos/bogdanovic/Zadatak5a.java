package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova ");
		int red = sc.nextInt();

		System.out.print("Broj kolona ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c = 0;

		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]= ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + ", " + j + "]= ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();

		System.out.println("Elementi matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");

			}
		}
		System.out.println();

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c += a[i][j] + b[i][i];
			}
		}

		System.out.println("Zbir svih clanova je: " + c);

	}

}