package milos.bogdanovic;

import java.util.Scanner;

public class DemoPrikaz {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Radnik r1 = new Radnik("Pera", 50, 150000);
		
		r1.obracunPlate();
		r1.opis();

	}

}
