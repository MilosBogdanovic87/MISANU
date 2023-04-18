package milosbogdanovic;

public class A implements Runnable {

	String ime;
	Thread t;
	
	
	A(String name){ // A je nova nit - konstruktor ovde sluzi za kreiranje nove niti
		ime = name;
		t = new Thread(this, ime);
		t.start();
	}
	
	public void run() {
		try {
		for(int i = 1; i <= 10; i++) {
			System.out.println(ime + " = " + i);
			
				Thread.sleep(500);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	

