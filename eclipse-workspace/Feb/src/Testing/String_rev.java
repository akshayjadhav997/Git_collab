package Testing;

public class String_rev {
public static void main(String[] args) {
	String s= "welcome to java world";
	//o/p : "world java to welcome"
	
	
	String strarr[]= s.split(" ");
	int a= strarr.length;
	//System.out.println(a);
	int i=0;
	for ( i =  a -1; i>=0; i-- ) {
		System.out.print(strarr[i]);
		System.out.print(" ");
	}
		
	
}
}
