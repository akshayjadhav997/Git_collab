package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;

public class thirdLargest {
	
public static void main(String[]args) {
	int arr[] = {5, 10,19, 5, 5, 5, 10, 19, 19};
	Arrays.sort(arr);
	for(int num : arr ) {
	System.out.println(num + " ");}
	//convert the Array to Set 
    Set<Integer> result = new HashSet<>();
    for(int num : arr ) {
    	result.add(num);
    	}
 
    // Print the Set 
    System.out.println("Set: " + result); 
    
 // converting HashSet to arraylist
    ArrayList arrayList = new ArrayList(result);

    // sorting the list
    Collections.sort(arrayList);
    
    // Print the ArrayList 
    System.out.println("ArrayList: " + arrayList);
    //Thirdlargest
    int Thirdlargest = (int) arrayList.get(0);
    System.out.println("Third last: " +Thirdlargest );
    
}


}

