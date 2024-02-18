package testing;

public class chices_matching {
public static void main(String[] args) {
	String s1= "010100";
	String s2= "011110";
	int x= 38475;
	int y= 12348;
	
	String convert= Integer.toString(x);
	System.out.println(convert.length());
	System.out.println(convert);
	
	String convert2= Integer.toString(y);
	System.out.println(convert2.length());
	System.out.println(convert2);
	
	
	int i=0,count=0;
	for(i=0;i<convert.length();i++) {
		if(convert.charAt(i) == convert2.charAt(i)){	
	        //System.out.println(s1.charAt(i));
			count++;
		}	
}
	System.out.println(count);
}
}