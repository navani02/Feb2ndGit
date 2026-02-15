package org.basicpgm;

public class Palindrome {
	public static void main(String[] args) {     
	
	int num=878; //MMD
	int backup=num;
	int result=0;
	
	while(num>0) {
		int lastDigit=num%10;
		result = result*10+lastDigit;   
		num=num/10;
	}
	
	if(backup==result) {
	System.out.println("Given number is Palindrome");
}else {
	System.out.println("Given number is not palindrome");
}  

}

}

