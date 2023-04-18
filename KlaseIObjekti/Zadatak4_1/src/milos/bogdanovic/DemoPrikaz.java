package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radnik r1 = new Radnik("Pera", 150000, 100);
		Radnik r2 = new Radnik("Mika", 120000, 80);
		
		System.out.println(r1.getPrihod());
		
		System.out.println(r2.obracunPlate());
		
		System.out.println(r1.opis());
		
		r2.drugiOpis();

	}

}
