package Testing;

public class Print_first_char_in_word {
public static void main(String[] args) {
	String s="my name is Akshay";
	//String ans = s.replaceAll("\\b[a-zA-Z]", " ");
	//System.out.println(ans);
	String arr[]= s.split(" ");
	for(int i=0;i<arr.length;i++) {
	String ans= arr[i];
	//s.substring(1, ans.length()-1);
	
	String k=ans.replaceAll(ans.substring(1, ans.length()), " ");
	System.out.print(k);
}
}
}
