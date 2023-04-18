package milosbogdanovic;

import java.util.Scanner;

public class SwitchCase5 {

    public static void main(String[] args) {
    double x, y;
    char operator;

    /* 1. deo: Unos podataka */
    Scanner ulaz = new Scanner(System.in);

    System.out.println("Unesite željeni operator: ");
    operator = ulaz.next().charAt(0);
    System.out.println("Unesite operand x: ");
    x = ulaz.nextDouble();
    System.out.println("Unesite operand y: ");
    y = ulaz.nextDouble();

    /* 2. deo: Obrada podataka */
    System.out.println("Rešenje sa SWITCH:");
    switch (operator) {
    case '+':
        System.out.println("X + Y = " + (x + y));
        break;
    case '-':
        System.out.println("X - Y = " + (x - y));
        break;
    case '*':
        System.out.println("X * Y = " + (x * y));
        break;
    case '/':
        System.out.println("X / Y = " + (x / y));
    }

    /* 2. deo: Obrada podataka sa IF/ELSE */
    System.out.println("\nRešenje sa ELSE/IF: ");
    if (operator == '+') {
        System.out.println("X + Y = " + (x + y));
    } else if (operator == '-') {
        System.out.println("X - Y = " + (x - y));
    } else if (operator == '*') {
        System.out.println("X * Y = " + (x * y));
    } else if (operator == '/') {
        System.out.println("X / Y = " + (x / y));
    } else {
        System.out.println("Nepravilan unos.");
    }

    ulaz.close();
    }

}