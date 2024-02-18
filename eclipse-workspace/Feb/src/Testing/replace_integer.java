package Testing;

public class replace_integer {
public static void main(String[] args) {
	
	String s= "har17ri91!@"; 
	
	String b = s.replaceAll("[^0-9]", "");
	
	System.out.println(b);
}
}
