package milos.bogdanovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finallyBlockWithExeption fbwe = new finallyBlockWithExeption();
		
		try {
			fbwe.procA();
		} catch (Exception e) {
			System.out.println("Exeption caught");
		}
		
		fbwe.procB();
		fbwe.procC();
		

	}

}
