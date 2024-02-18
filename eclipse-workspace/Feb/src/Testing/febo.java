package Testing;

public class febo {
public static void main(String[] args) {
//output : 0,1,1,2,3,5,8,13
//	       a,b,c
	
	int n=13;
    int a=0, b=1;
    System.out.print(a);
    System.out.print(b);
    for(int i=0;i<n;i++) {
    	int c=a+b;
    	System.out.print(c);
    	a=b;
    	b=c;
    	
    }
	
}
}