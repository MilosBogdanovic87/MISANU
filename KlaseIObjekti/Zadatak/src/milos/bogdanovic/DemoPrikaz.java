package milos.bogdanovic;

import java.util.Scanner;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cat cat = new Cat();
		
		System.out.println("Unesite ime macke: ");
		cat.ime = sc.nextLine();
		
		cat.prikaziIme();
		
		sc.close();
		
	}

}
