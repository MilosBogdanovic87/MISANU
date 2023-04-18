package milosbogdanovic;

public class WhilePetlja01 {

	public static void main(String[] args) {
		// Napisati program kojim se štampaju prvih 10 prirodnih brojeva koriscenjem for
		// i while petlje

		// Resenje sa for petljom
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("------------");
		// Resenje sa while petljom
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

}
