package org.basicpgm;

public class ProductOfGivenDigit {
	public static void main(String[] args) {
		
		int num=878; 
		int backup=num;
		int result=1;
		
		while(num>0) {
			int lastDigit=num%10;
			result = result*lastDigit; 
			num=num/10;
		}
		System.out.println("Print product of given digit: "+result);

	  }

}
