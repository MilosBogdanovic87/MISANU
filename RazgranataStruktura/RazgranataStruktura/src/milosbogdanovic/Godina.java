package milosbogdanovic;

import java.util.Scanner;

public class Godina {

    public static void main(String[] args) {
    /* Deklarisanje promenljivih */
    int godina;
    Scanner sc = new Scanner(System.in);

    /* Unos podataka */
    System.out.println("Unesite godinu: ");
    godina = sc.nextInt();

    /* Obrada podatka */
    if (godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
        System.out.println("Uneta godina " + godina + " je prestupna.");
    } else {
        System.out.println("Uneta godina " + godina + " nije prestupna.");
    }

    sc.close();
    }

}