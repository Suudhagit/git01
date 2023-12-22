package org.llb;

import java.util.Scanner;

public class SwappingNum  {
public static void main(String[] args) {
	int x,y,temp;
	System.out.println("enter x and y");
	Scanner s=new Scanner(System.in);
	x=s.nextInt();
	y=s.nextInt();
	System.out.println("before swapping"+x  + y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("after swapping"+ x+y);
	
	
	
	
	
	
	
	
	int a,b;
	System.out.println("enter a and b");
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("before swapping\na="+a+"\nb ="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping\na="+a +"\nb ="+b);
	
}

}