package au.com;

public class JUnit {

	public static void main(String [] args) {
		
		CheckPrime obj = new CheckPrime();
		
		try {
			
		
		for(int number = 1 ; number < 100 ; number++ ) {
			
			if(obj.isPrime(number)) {
				throw new ArithmeticException();
				
			}
		}
	}
		catch(Exception e) {
			
			System.out.print("Prime number encountered");
		}
}
}