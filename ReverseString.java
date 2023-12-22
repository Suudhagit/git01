package org.llb;

import java.security.DomainCombiner;
import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
String s="sudha";
StringBuilder ss=new StringBuilder();
StringBuilder ap = ss.append(s);
	System.out.println(ap.reverse());
	
	
	
	String aq="Automation";
	char[] ch = aq.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.println(ch[i]);
	}
	
	
	String c="mathswellsudha";
	char[] cj = c.toCharArray();
	for(int j=cj.length-1;j>=0;j--) {
		System.out.print(cj[j]);
	}
	
	
	
	String org,rev="";
	System.out.println("enter string to be reversed");
	Scanner ssc=new Scanner(System.in);
	String nd = ssc.nextLine();
	for(int i=nd.length()-1;i>=0;i--) {
		rev=rev+nd.charAt(i);
	}
	System.out.println(rev);
}
}


