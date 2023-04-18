package milosbogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NegativanBroj negBr = (int n) ->  (n < 0);
		
		if(negBr.testBroj(3))
			System.out.println("Negativan");
		else
			System.out.println("Pozitivan!");
		
		
	}

}
