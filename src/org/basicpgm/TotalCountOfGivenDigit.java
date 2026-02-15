package org.basicpgm;

public class TotalCountOfGivenDigit {
	public static void main(String[] args) {
	
	int num=878;  
	int count=0;
	
	while(num>0) {
		num=num/10;
		count++;
	}
	System.out.println("print total count of given digit: "+count);
	System.out.println("Login successful");

	
    System.out.println("Logout successful");
  }
	
}