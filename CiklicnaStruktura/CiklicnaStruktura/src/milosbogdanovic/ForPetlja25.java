package milosbogdanovic;

import java.util.Scanner;

public class ForPetlja25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite vrednost za a: ");
			double a = input.nextDouble();
			double y;
			if (a > 0)
				y = Math.sqrt(a);
			else
				y = a * a;
			System.out.println("Za unetu vrednost a = " + a + " dobija se y = " + y);
		}
		input.close();
	}
}
