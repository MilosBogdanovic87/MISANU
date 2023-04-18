package milosbogdanovic;

import java.util.Scanner;

public class SwitchCase6 {

    public static void main(String[] args) {
    int k1, k2, k3, boolToInt;
    boolean i;

    /* 1. deo: Unos podataka */
    Scanner ulaz = new Scanner(System.in);

    System.out.println("Unesite vrednost za k1: ");
    k1 = ulaz.nextInt();
    System.out.println("Unesite vrednost za k2: ");
    k2 = ulaz.nextInt();
    System.out.println("Unesite vrednost za k3: ");
    k3 = ulaz.nextInt();

    i = ((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0);

    boolToInt = i ? 1 : 0;

    /* SA SWITCH 2. deo: Obrada podataka */
    System.out.println("Rešenje sa SWITCH:");
    switch (boolToInt) {
    case 1:
        System.out.println("Isti dan u nedelji!");
        break;
    case 0:
        System.out.println("Nije isti dan u nedelji!");
        break;
    default:
        System.out.println("Pogresan unos!");
    }

    /* SA IF/ELSE 2. deo: Obrada podataka */
    System.out.println("\nRešenje sa If/Else:");
    if ((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0) {
        System.out.println("Isti dan u nedelji!");
    } else {
        System.out.println("Nije isti dan u nedelji!");
    }
    ulaz.close();
    }

}