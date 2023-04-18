package milosbogdanovic;

import java.util.Scanner;

public class UgnjezdeniIF3 {

    public static void main(String[] args) {

    char n;

    // 1. deo algoritma: Unos podataka
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite kategoriju: ");
    n = sc.nextLine().charAt(0);
    sc.close();

    // 2. deo algoritma: Obrada podataka
    switch (n) {
    case 'A':
    case 'a':
        System.out.println("Mozete voziti Motor.");
        break;
    case 'B':
    case 'b':
        System.out.println("Mozete voziti Automobil.");
        break;
    case 'C':
    case 'c':
        System.out.println("Mozete voziti Auto i Kamion");
        break;
    case 'D':
    case 'd':
        System.out.println("Mozete voziti Autobus, Kamion i Auto.");
        break;
    case 'E':
    case 'e':
        System.out.println("Mozete voziti Auto, Kamion i Autobus.");
        break;
    default:
        System.out.println("Neispravan unos!");

    }

    }

}
    