package testing;

import java.util.HashMap;
import java.util.Map;

public class Max_string {
public static void main(String[] args) {
	
	String s1= "bbbbbeeeeennnnnnkkkk";
	String s2= s1.toLowerCase();
	int count=0;
	char c= 0 ;
	
	Map<Character, Integer> m = new HashMap<Character, Integer>();
	for(int i=0 ; i<s2.length(); i++) {
		char b= s2.charAt(i);
		m.put(b, m.getOrDefault(b, 0) + 1);
		
		if(count<m.get(b)) {
			count=m.get(b);
			 c= b;
		}
		
	}
	System.out.println(m);
	System.out.println(c);
	
}
}
