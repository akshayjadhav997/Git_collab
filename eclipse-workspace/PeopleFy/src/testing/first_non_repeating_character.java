package testing;

public class first_non_repeating_character {
public static void main(String[] args) {
	String s= "akkshay";
	//finding out first occurance
	for(int i=0;i<s.length();i++) {
		
		if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
		System.out.println(s.charAt(i)); 
		break;
	}
	}
}
}
