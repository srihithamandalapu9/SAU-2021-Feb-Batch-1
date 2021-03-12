package au.com;

public class ToDoService {
	
	CheckPrime check_prime ;
	
	public boolean verifyPrime(int number) {
		
		return check_prime.verify(number);
	}
	
	public CheckPrime getObject() {
		
		return check_prime ;
	}
	
	public void setObject(CheckPrime check_prime) {
		
		this.check_prime = check_prime ;
	}

}
