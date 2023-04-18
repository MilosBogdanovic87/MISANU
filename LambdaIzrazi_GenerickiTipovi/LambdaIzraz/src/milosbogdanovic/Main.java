package milosbogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestiraBroj paranBroj =  (i) ->  (i % 2) == 0;   /* ovde dolazi lambda izraz () -> (n % 2 == 0) */
		TestiraBroj neparanBroj =  (i) ->  (i % 2) != 0;   /* ovde dolazi lambda izraz () -> (n % 2 == 0) */
		
		
		if(paranBroj.test(12)){
			System.out.println("Paran broj!");
		}
		else 
		{
			System.out.println("Nije paran");
		}
		
		if(neparanBroj.test(3)) {
			System.out.println("Neparan broj");
		}


		// levaStranaLambdaIzraza		->      desnaStranaLambdaIzarza
				
		// () -> 123.45 - najprostiji lambda izraz
		
		
				
				
		
	}

}
