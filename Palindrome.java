package org.llb;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Palindrome {
	public static void main(String[] args) {
		
	int n= 787;

	int num = 7890;
	int r,sum=0;
	String s= Integer.toString(num);
	StringBuilder s2 = new StringBuilder();
	s2 = s2.append(s);
	StringBuilder s3 = s2.reverse();
	String s4 = s3.toString();
	 
	

	System.out.println();
	int num2 = Integer.parseInt(s4);
	if(num==num2) {
		System.out.println(num+" palindrome");
	}else {
		System.out.println(num+" not a palindrome");
	}
	int temp =n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp) {
		System.out.println(temp+"palindrome");
	}else {
		System.out.println(temp+"not a palindrome");
	}
}
}