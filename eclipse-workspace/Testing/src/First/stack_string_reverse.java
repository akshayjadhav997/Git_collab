package First;

import java.util.Stack;

public class stack_string_reverse {
public static void main(String[] args) {
	String a= "Akshay";
	
	Stack <Character> s= new Stack <Character>();
	for(int i=0;i<a.length();i++) {
		char b= a.charAt(i);
		s.add(b);
	}System.out.println(s);
}
}
