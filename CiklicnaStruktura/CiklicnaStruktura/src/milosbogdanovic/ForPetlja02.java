package milosbogdanovic;

public class ForPetlja02 {

	public static void main(String[] args) {
		System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");

		for (int broj = 1; broj <= 5; broj++) {
			System.out.printf("%8d%8d%8d \n", broj, broj * broj, broj * broj * broj);
		}
	}

}