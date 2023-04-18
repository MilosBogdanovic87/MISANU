package milos.bogdanovic;

public class Primer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I nacin: inicijalizacija dvodimenzionalnog niza
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// Stampanje elemenata dvodimenzionalnog niza
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}

}
