package milosbogdanovic;

import java.util.Scanner;

public class UgnjezdeniIF2 {

    public static void main(String[] args) {

    char n;

    // 1. deo algoritma: Unos podataka
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite kategoriju: ");
    n = sc.nextLine().charAt(0);
    sc.close();

    // 2. deo algoritma: Obrada podataka
    if (n == 'A' || n == 'a') {
        System.out.println("Mozete voziti Motor.");
    } else if (n == 'B' || n == 'b') {
        System.out.println("Mozete voziti Automobil.");
    } else if (n == 'C' || n == 'c') {
        System.out.println("Mozete voziti Auto i Kamion");
    } else if (n == 'D' || n == 'd') {
        System.out.println("Mozete voziti Autobus, Kamion i Auto.");
    } else if (n == 'E' || n == 'e') {
        System.out.println("Mozete voziti Auto, Kamion i Autobus.");
    } else {
        System.out.println("Neispravan unos!");
    }

    }

}
