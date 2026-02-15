package org.basicpgm;

public class SumOfGivenDigit {
	public static void main(String[] args) {
		
	int num=878; 
	int backup=num;
	int result=0;
	
	while(num>0) {
		int lastDigit=num%10;
		result = result+lastDigit; 
		num=num/10;
	}
	System.out.println("Print sum of given digit: "+result);

  }

}
