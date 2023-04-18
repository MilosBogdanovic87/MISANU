package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Domine d1 = new Domine(2, 4);
		Domine d2 = new Domine(3, 4);
		
		System.out.println("Da li su domine iste: " +  d1.ista(d2));
		System.out.println("Prva domina: " + d1.tekstualniOpis());
		System.out.println("Druga domina: " + d2.tekstualniOpis());
		d1.okreni();
		System.out.println("Prva domina nakon okretanja: " + d1.tekstualniOpis());

	}

}
