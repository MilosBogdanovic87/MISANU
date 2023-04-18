package milos.bogdanovic;

import java.util.Scanner;

public class LogickiIzraz {

    public static void main(String[] args) {
	// Unos: unosenje logickih vrednosti promenjivih x i y
	Scanner ulaz = new Scanner(System.in);
	System.out.println("Unesite vrednost x: ");
	boolean x = ulaz.nextBoolean();
	System.out.println("Unesite vrednost y: ");
	boolean y = ulaz.nextBoolean();

	// Obrada: izračunavanje
	boolean z = (!(x && y) || x && y);

	// Izlaz: Stampanje rezultata
	System.out.println("z = " + z);
	ulaz.close();
    }

}