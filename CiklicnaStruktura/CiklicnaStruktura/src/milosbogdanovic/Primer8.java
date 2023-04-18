package milosbogdanovic;

import java.text.DecimalFormat;

public class Primer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.##");

		double x0 = 18.0;
		double x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0;

		while (Math.abs(x1 - x0) > 1.0E-5) {
			x0 = x1;
			x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18;

		}
		System.out.println("Dobijena vrednost je x = " + df.format(x1));

	}

}
