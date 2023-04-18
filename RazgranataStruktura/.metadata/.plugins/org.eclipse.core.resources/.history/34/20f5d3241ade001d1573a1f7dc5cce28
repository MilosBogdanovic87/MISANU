package milosbogdanovic;

import java.util.Scanner;

public class UgnjezdeniIF4 {
    public static void main(String[] args) {
    // 0. deo: Deklarisanje promenljivih

    Scanner ulaz = new Scanner(System.in);
    int dan, mesec, godina, limit;
    limit = 0;

    // 1.deo: Unos podataka
    System.out.println("Unesite dan: ");
    dan = ulaz.nextInt();
    System.out.println("Unesite mesec: ");
    mesec = ulaz.nextInt();
    System.out.println("Unesite godinu: ");
    godina = ulaz.nextInt();
    ulaz.close();

    // 2. deo: Obrada podataka
    switch (mesec) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:

        limit = 31;

        break;
    case 4:
    case 6:
    case 9:
    case 11:

        limit = 30;

        break;

    case 2:
        if (godina % 4 == 0) {
        limit = 29;
        } else {
        limit = 28;
        }
        break;

    }
    if (dan + 7 > limit) {
        dan = dan + 7 - limit;
        mesec = mesec + 1;

        if (mesec > 12) {
        mesec = 1;
        godina = godina + 1;
        }

    } else {
        dan = dan + 7;

    }

    // 3. deo: Stampanje izlaznog podatka
    System.out.println("Datum koji ce biti za 7 dana je " + dan + "." + mesec + "." + godina);

    }

}