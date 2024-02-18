package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Set.*;

public class sorting_array {
public static void main(String[] args) {
	int [] arr = {10,20,13,25,9,90,2,4,4,4,4,4};
	
	List<Integer> alist= new ArrayList<Integer>();
	for(int num3 : arr) {
		alist.add(num3);
	}
	Collections.sort(alist);
	System.out.println(alist);
	
	Set<Integer> s= new HashSet<Integer>();
	for(int num2 : alist ) {
		s.add(num2);
	}
	System.out.println(s);
	System.out.println(s.size()-2);
	
/*	Set <Integer> sort1 = new HashSet<Integer>();
	for(int num : arr) {
		sort1.add(num);
	}
	System.out.println(sort1);
	//Collections.sort
	List<Integer> result = new ArrayList<Integer>();
	for(int num1 : sort1)
	{
		result.add(num1);
	}
	Collections.sort(result);
	if(result.size()<2) {
		System.out.println("No 3rd largest");
	}
	else {
	System.out.println(result.get(result.size()-3));}
	*/
}  
}
