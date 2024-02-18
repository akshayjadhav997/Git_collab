package Testing;

public class even_odd {
public static void main(String[] args) {
	int n=7386554;
	int reminder=n%2;
	int quotient=n/2;
	if(reminder==0) {
		System.out.println(reminder +" is remainder"+ quotient+ "is quatient");
		System.out.println(n+ " is even");
	}else{
		System.out.println(n+ " is odd");
	}
}

}
