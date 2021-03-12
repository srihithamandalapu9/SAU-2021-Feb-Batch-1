package au.com;

public class CheckPrime {

	public boolean isPrime(int number) {
		
		if(number  == 2) {
			return true;
		}
		else if(number == 1) {
			return false;
		}
		
		else {
			for(int i = 2 ; i < number/2 +1 ;i++) {
				
				if(number % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
}
