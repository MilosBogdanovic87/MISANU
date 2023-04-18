package milos.bogdanovic;

import java.util.Scanner;

public class Zadatak4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova ");
		int red = sc.nextInt();

		System.out.println("Broj kolona ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];

		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]= ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("b[" + i + ", " + j + "]= ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();

		System.out.println("elementi matrice b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Zbir matrica a i b je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
		System.out.println();

	}

}
