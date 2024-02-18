package Annotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.testng.annotations.Test;

public class TestNG_annootations {
	public static void main(String[] args)  {
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




