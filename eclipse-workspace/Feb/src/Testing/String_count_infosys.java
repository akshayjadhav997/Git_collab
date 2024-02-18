package Testing;

import java.util.HashMap;
import java.util.Map;

public class String_count_infosys {
public static void main(String[] args) {
	
	String a= "aabbccc";

	Map <Character, Integer> x = new HashMap<Character, Integer>();
    int i=0; 
	for (i=0; i<a.length(); i++){
		//String b = a.charAt(i);
	   x.put(a.charAt(i), x.getOrDefault(a.charAt(i),0)+1);
	}
	System.out.println(x);
}
}
