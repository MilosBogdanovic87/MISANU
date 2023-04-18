package milos.bogdanovic;

import javax.management.RuntimeErrorException;

public class finallyBlockWithExeption {

	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("Demo"); //throws je u zaglavlju metode
			// throw koriste se za bacanje izuzetaka u telu metode
		}
		finally { //finally blok se izvrsava bez obzira da li je ili nije doslo do izuzetka
			System.out.println("procA's finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("procB");
			return;
		} finally {
			System.out.println("procB's fanally");
		}
	}
	
	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("proC's finally");
		}
	}
	
}
