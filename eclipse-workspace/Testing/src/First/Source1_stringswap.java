package First;

public class Source1_stringswap {
	public static void main(String[] args) {
		
	
 String a = "AKSHAY";
 
 String b = "Jadhav1";
		 
     a=a+b;
     System.out.println(a);
     b=a.substring(0, a.length()-b.length());
     System.out.println("string b is " + b);
     a=a.substring(b.length());
     System.out.println("string a is " + a);
}
}
