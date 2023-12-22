package org.llb;

public class Arrays {
public static void main(String[] args) {
	int [] a= {23,764764,53};
	int high =0;
	int sec=0;
	for(int s:a) {
		if(high<s) {
			high=sec;
			high=s;
		}
		else if(sec<s) {
			sec=s;
		}
		
	}
	System.out.println(high);
	System.out.println(sec);
//	int num[]= {1,63,6885,65};
//	int highest = 0;
//	int secondhighest=0;
//	for(int n:num) {
//		if(highest<n) {
//			secondhighest=highest;
//			highest=n;
//		}
//		else if(secondhighest<n) {
//			secondhighest=n;
//		}
//		
//	}
////	System.out.println(highest);
//	System.out.println(secondhighest);
}	

}
