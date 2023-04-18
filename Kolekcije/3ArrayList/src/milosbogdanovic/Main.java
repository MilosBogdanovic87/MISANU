package milosbogdanovic;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// interfejs <T> ime = new ArrayList<T>();
		// T predstavlja tip promenljive
		
		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		
		// add - sluzi za dodavanje vrednosti unutar kolekcije
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);
		
		System.out.println(kolekcijaAL);
		
		// Zakljucak: Koristite ArrayList kada ne znate unapred velicinu niza

	}

}
