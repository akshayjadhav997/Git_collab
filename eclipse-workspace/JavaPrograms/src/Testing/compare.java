package Testing;

import java.util.Iterator;

public class compare {
public static void main(String[] args) {
	String a= "010111";
	String b ="110011";
	int i, result=0;
	for(i=0; i<5;i++);
	{
	char ch = a.charAt(i);
	char ch1=b.charAt(i);
	if (ch.equals(ch1)) {
		result++;
	}
	}
	System.out.println(result);
}
}
