package Testing;

public class string_pair_swap {
public static void main(String[] args) {
	String a= "Akshay";
	char ch[]= a.toCharArray();
	//iterate +2
	for (int i=0; i<ch.length; i+=2) {
		char temp=ch[i];
		ch[i]=ch[i+1];
		ch[i+1]=temp;
	}
	System.out.println(ch);
}
}
