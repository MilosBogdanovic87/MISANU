package milosbogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A<Integer, String> ob = new A<Integer, String>(100, "Proba");
		
		ob.prikaziTip();
		
		int intVrednost = ob.getOb1();
		System.out.println("Vrednost T je: " + ob.getOb1());
		
		String stringVrednost = ob.getOb2();
		System.out.println("Vrednost V je: " + stringVrednost);
		
		System.out.println();
		
		A<String, Double> ob2 = new A<String, Double>("Java", 200.2);
		
		ob2.prikaziTip();
		
		String s2 = ob2.getOb1();
		System.out.println("Vrednost T2: " + s2);
		Double d2 = ob2.getOb2();
		System.out.println("Vrednost V2: " + d2);
		
		System.out.println();
		
		A<Boolean, Integer> ob3 = new A<Boolean, Integer>(true, 101);
		
		ob3.prikaziTip();
		
		Boolean b3 = ob3.getOb1();
		System.out.println("Vrednost T3: " + b3);
		int i3 = ob3.getOb2();
		System.out.println("Vrednost V3: " + i3);
		

	}

}
