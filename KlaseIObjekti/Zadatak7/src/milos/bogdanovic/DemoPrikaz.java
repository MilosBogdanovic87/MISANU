package milos.bogdanovic;

import java.util.Scanner;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a: ");
		double a = sc.nextDouble();
		
		Apsolutna v = new Apsolutna(a);
		
		System.out.println("Apsolutna vrednost je: " + v.apsolutna());

	}

}
