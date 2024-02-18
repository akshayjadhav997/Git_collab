package testing;

public class pallindrom {
	public static void main(String[] args) {
		String s1= "ababa";
		System.out.println("Input String= "+ s1);
		String rev= "";
		int i=0;
		for( i= s1.length()-1 ; i>=0; i--)
		{
			rev=rev + s1.charAt(i);
		}
		
		if(rev.equals(s1)) {
			System.out.println("The string is pallindrom");
		}
		else {
			System.out.println("The string is not pallindrom");
		}
	}

}
