package milosbogdanovic;

import java.util.Scanner;

public class SwitchCase3 {

    public static void main(String[] args) {
    int ugao;

    /* 1. deo: Unos podataka */

    Scanner ulaz = new Scanner(System.in);

    System.out.println("Unesite ugao: ");
    ugao = ulaz.nextInt();

    /* 2. deo: Obrada podataka */
    if (ugao > 0 && ugao < 90) {
        System.out.println("Prvi kvadrant.");
    } else if (ugao > 90 && ugao < 180) {
        System.out.println("Drugi kvadrant.");
    } else if (ugao > 180 && ugao < 270) {
        System.out.println("Treći kvadrant.");
    } else if (ugao > 270 && ugao < 360) {
        System.out.println("Četvrti kvadrant.");
    } else {
        System.out.println("Unet ugao se nalazi na x ili y osi.");
    }
    ulaz.close();
    }

}  