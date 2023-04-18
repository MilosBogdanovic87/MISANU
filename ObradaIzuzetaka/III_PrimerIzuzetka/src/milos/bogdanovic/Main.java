package milos.bogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d, a;
		
		try { //U try bloku se stavljaju naredbe koje mogu hvatati izuzetak,
			//kao i one naredbe koje se nece izvrsiti ako dodje do izuzetka
			d = 0;
			a = 10 / d;		
			System.out.println("Ova poruka nece biti odstampana!");
		}
		catch(ArithmeticException e) {
			System.out.println("Deljenje nulom! ");
		}
		System.out.println("Program nastavlja sa izvrsenjem! ");

	}

}

//Postoji i klasa AritmeticExeption a e predstavlja objekat te klase
/*Hijerarhija izuzetaka
 * Svi izuzeci izvedeni su iz klae Throwable.
 * Klasa Throwable ima dva direktna naslednika (potomka): Error i Exeption
 * 
 * Klasa Error opisuje fatalne greske(greske na koje ne mozemo uticati).
 * Za greske tog tipa nije potrebno navoditi try/catch blokove.
 * 
 * Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju neproverenim tipovim izuzetaka.
 * 
 * Exeption {Runtime exception, IOException}
 * 
 * RuntimeException(IndexOutBoundsException, AritmeticException)
 * 
 */
