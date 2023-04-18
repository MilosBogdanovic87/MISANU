package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrica m1 = new Matrica(5, 4);
		
		System.out.println("Matrica ima " + m1.kolona() + " vrsta");
		System.out.println("Broj kolona: " + m1.vrsta());
		
		System.out.println(m1.postavi(1, 2, 3));
		
		System.out.println(m1.getDohvati(1, 2));
		
		System.out.println(m1.toString());

	}

}
