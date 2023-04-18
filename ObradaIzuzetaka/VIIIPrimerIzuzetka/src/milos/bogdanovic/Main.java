package milos.bogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 0;
			int b = 10 / a;
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom/Izuzetak");
		}//catch(ArithmeticException e)
		//System.out.println("Deljenje nulom/Izuzetak1");
	}

}

// Ukoliko postoji vise kes blokova i tip parametara odgovara tipu bacenog izuzetka izvrsava se samo prvi takav catch blok/
//Greska je navesti dva catch bloka sa istim tipom parametra