package com.au.java;

import java.util.Scanner;

class PrimeException extends Exception{
	
	PrimeException(int number ){
		
		System.out.println(number +" is prime ");
	}
}
public class CustomException {

	static boolean is_prime(int num) {
		
		if(num == 2) {
			return true;
		}
		
		else if(num == 1){
			return false;
		}
		
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num % i == 0) {
				return false;
			}
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		try {
		for(int num = 1 ; num < 100 ; num++) {
			if( is_prime(num)) {
				throw new PrimeException(num);
			}
		}
		}
		catch(Exception ex) {
			System.out.print("Exception raised : "+ ex);
		}
		
		
	}
}
