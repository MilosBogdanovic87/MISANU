package milosbogdanovic;

public class C extends Thread {

	C(String m){
		super(m); 
	}
	
	public void run() {
		for(int i = 1; i <= 15; i++) {
			System.out.println(getName());
		}
}
	
}
