package milos.bogdanovic;

import java.util.Scanner;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Knjiga book = new Knjiga();
		
		
		
		
		System.out.println("Ime knjige: ");
		book.ime = sc.nextLine();
		
		//book.imeKnjige();
		
		
		System.out.println("Broj strana: ");
		book.brojStrana = sc.nextInt();
		
		book.imeKnjige();
		book.brojStrana();
		
		sc.close();
		
	}

}