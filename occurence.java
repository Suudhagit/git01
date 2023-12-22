package org.llb;

import java.util.*;

public class occurence {
	public static void main(String[] args) {
		
	
	String s="hhhhhh";
	Map<Character,Integer> m=new HashMap();
	for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
		if(m.containsKey(ch)) {
			Integer count = m.get(ch);
			m.put(ch, count++);
		}
		else {
			m.put(ch,1);
		}
		
	}
	System.out.println(m);
	}
}
