package milosbogdanovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		TestBroj deljivost = (int i, int d) -> (i % d) == 0;
		
		System.out.println("Unesite i i d: ");
		int i = sc.nextInt();
		int d = sc.nextInt(); 
		
		if(deljivost.test(i, d)){
			System.out.println("Deljiv!");
		}
		else 
		{
			System.out.println("Nije deljiv");
		}
		
		
		
	}

}
