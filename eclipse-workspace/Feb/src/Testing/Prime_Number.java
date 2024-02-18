package Testing;

public class Prime_Number {
	public static void main(String[] args) {
		//output: 2, 3, 5, 7, 11, 13, 17
	
		int n=0;
		int flag = 0;
		if(n==0 || n==1) {
			System.out.println(n + "is not prime");
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println(n + "is not prime");
					flag=1; 
					break;
				}
			}if(flag==0) {
				System.out.println(n + "is  prime");
		}
		}
		
	}
	}




