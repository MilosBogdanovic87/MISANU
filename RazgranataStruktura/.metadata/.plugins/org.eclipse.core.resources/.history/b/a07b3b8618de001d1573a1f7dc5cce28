package milosbogdanovic;

import java.io.*;
import java.text.DecimalFormat;

public class RazgranataStruktura1 {
    public static void main(String[] args) throws Exception {
    double x, y, f;
    DecimalFormat df = new DecimalFormat("#.##");
    BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Unesite vrednost za x: ");
    x = Double.parseDouble(ulaz.readLine());
    System.out.print("Unesite vrednost za y: ");
    y = Double.parseDouble(ulaz.readLine());
    if (x > y)
        f = Math.sqrt((x - 0.2) / (2 + y));
    else
        f = Math.sqrt((y - 0.2) / (2 + x));
    System.out.println("Vrednost funkcije je " + df.format(f));
    }
}