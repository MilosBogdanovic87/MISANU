package milos.bogdanovic;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[][] niz = new int[ 5 ][ 5 ];
		int niz[][] = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
