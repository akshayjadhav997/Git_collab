package testing;

import java.util.List;

public class Str_India {
	
	//Question : If my input is "Ind" then i should get india,Indonesia from below list
	//India,iraq,nepal,italy,Indonesia,Iceland,Australia,Afghanistan,Austria
public static void main(String[] args) {
	
	String s1="India iraq nepal";
	String s2="India,iraq,nepal,italy,Indonesia,Iceland,Australia,Afghanistan,Austria";
	//converting to String array
	String strarray1 = s1.trim();
	String[] strarray = s2.split(",");
	String s3= s2.toLowerCase();
	String s4= s2.toUpperCase();
	
	if(s1.contains("In"))
	{
	System.out.println(s1);
	}
	

int number = 42; 
String strNumber = String.valueOf(number); // "42" 
System.out.println(strNumber);
  
// Alternatively 
String strNumber1 = Integer.toString(number); // "42"
System.out.println(strNumber1);
System.out.println(s3 + "," + s4);
	
	
	
	
}
}
