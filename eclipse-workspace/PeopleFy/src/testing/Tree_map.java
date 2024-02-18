package testing;

import java.util.Map;
import java.util.TreeMap;

public class Tree_map {
public static void main(String[] args) {
	String s= "fuweufyjhj";
	Map <Character, Integer> m= new TreeMap<Character, Integer>();
	for(int i=0; i<s.length();i++) {
		char b= s.charAt(i);
		m.put(b, m.getOrDefault(b, 0)+1);
	}
	System.out.println(m);
}
}
