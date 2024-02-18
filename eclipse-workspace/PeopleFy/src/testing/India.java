package testing;

import java.util.Arrays;

public class India {
public static void main(String[] args) {
	String S1 = "India,iraq,nepal,Indonacia";
	String strArray[] = null;  
	//converting using String.split() method with whitespace as a delimiter  
	strArray = S1.split(",");  
	//System.out.println(strArray[0]); 
	//printing the converted string array  
	for (int i = 0; i< strArray.length; i++){
		String userCode = "Ind";
		if(strArray[i].contains(userCode)){
	    System.out.println(strArray[i]);  
	}  
	}	
}
}
