package org.llb;

public class ReverseNumWord {
	public static void main(String[]args) {
	int n=7777;
	int Reverse=0;
	int lastDigit;
	int temp=n;
	while(n>0) {
		lastDigit=n%10;
		Reverse=(Reverse*10)+lastDigit;
		n=n/10;
		
		
		
	}
	System.out.println(Reverse);
	
		
	if(Reverse==temp) {
		System.out.println("its a palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	
		
	

}}
