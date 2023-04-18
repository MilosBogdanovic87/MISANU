package milos.bogdanovic;

import java.util.Scanner;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Osoba o1 = new Osoba();
		
		System.out.println("Unesite ime: ");
		o1.ime = sc.nextLine();
		System.out.println("Unesite datum: ");
		o1.datum = sc.nextLine();
		System.out.println("Unesite adresu: ");
		o1.adresa = sc.nextLine();
		
		System.out.println(o1.ispisi());
		
	}

}
