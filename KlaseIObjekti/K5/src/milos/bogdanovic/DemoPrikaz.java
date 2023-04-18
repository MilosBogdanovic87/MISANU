package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.initBox(10, 15, 20); // poziv metode za objekat b1
		
		b2.initBox(5, 6, 7); // poziv metode za objekat b2
		
		System.out.println("Zapremina1: " + b1.volume()); // poziv (druge) metode
		System.out.println("Zapremina2: " + b2.volume());
		
		

	}

}
