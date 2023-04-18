package milosbogdanovic;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SwitchCase4 {

    public static void main(String[] args) {
    double c1, c2;
    String veza;

    /* 1. deo: Unos podataka */
    DecimalFormat df = new DecimalFormat("#.##");
    Scanner ulaz = new Scanner(System.in);

    System.out.println("Unesite da li je 'Redno' ili 'Paralelno' vezivanje: ");
    veza = ulaz.nextLine();
    System.out.println("Unesite vrednost za c1: ");
    c1 = ulaz.nextInt();
    System.out.println("Unesite vrednost za c2: ");
    c2 = ulaz.nextInt();

    /* 2. deo: Obrada podataka IF-ELSE */
    if (veza.equalsIgnoreCase("Redno")) {
        System.out.println("Ekvivalnentni kapacitet redne veze: " + df.format(c1 * c2 / (c1 + c2)));
    } else if (veza.equalsIgnoreCase("Paralelno")) {
        System.out.println("Paralelna veza: " + df.format((c1 + c2)));
    } else {
        System.out.println("Pogrešan unos!");
    }

    ulaz.close();

    }

}
