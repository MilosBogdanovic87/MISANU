package milos.bogdanovic;

public class DemoPrikaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Valjak v1 = new Valjak(3, 4);
		
		System.out.println("Visina: " + v1.getVisina());
		System.out.println("Poluprecnik: " + v1.getPoluprecnik());
		System.out.println("Zapremina: " + v1.Zapremina());
		v1.opis();
	}

	

}
