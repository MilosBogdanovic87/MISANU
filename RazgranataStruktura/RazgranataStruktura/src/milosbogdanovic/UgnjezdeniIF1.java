package milosbogdanovic;


import java.util.Scanner;

public class UgnjezdeniIF1 {

    public static void main(String[] args) {

    int najveciBroj;
    // 1. deo algoritma: Unos podataka
    Scanner sc = new Scanner(System.in);

    System.out.println("Unesite prvo broj: ");
    int br1 = sc.nextInt();

    System.out.println("Unesite drugi broj: ");
    int br2 = sc.nextInt();

    System.out.println("Unesite treci broj: ");
    int br3 = sc.nextInt();
    sc.close();
    // 2. deo algoritma: Obrada podataka
    if (br1 > br2) {
        if (br1 > br3) {
        najveciBroj = br1;
        } else {
        najveciBroj = br3;
        }
    } else {
        if (br2 > br3) {
        najveciBroj = br2;
        } else {
        najveciBroj = br3;
        }
    }

    // 3. deo algoritma: Ispisivanje vrednosti
    System.out.println("Najveci od unetih brojeva je: " + najveciBroj);
    }

}