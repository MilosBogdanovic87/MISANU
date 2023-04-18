package milos.bogdanovic;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LinijskaStruktura13 {

    public static void main(String[] args) {
    // Deklarisanje promenljivih
    double a, b, c, la, ma;
    DecimalFormat df = new DecimalFormat("#.##");
    // Unos podataka
    Scanner ulaz = new Scanner(System.in);
    System.out.println("Unesite vrednost stranice a: ");
    a = ulaz.nextDouble();
    System.out.println("Unesite vrednost stranice b: ");
    b = ulaz.nextDouble();
    System.out.println("Unesite vrednost stranice c: ");
    c = ulaz.nextDouble();

    // Izračunavanje dužine simetrale ugla iz temena A

    la = 1 / (b + c) * Math.sqrt(b * c * (Math.pow(b + c, 2) - Math.pow(a, 2)));

    // Izralunavanje dužine stranice a
    ma = 0.5 * Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - a * a);

    // Štampanje vrednosti
    System.out.println("La = " + df.format(la) + "\nma = " + df.format(ma));

    ulaz.close();
    }

}