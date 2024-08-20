package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int[] value = new int[n];
		System.out.println("Enter value");
		
		for(int i=0; i<n; i++)
		{
			value[i] = sc.nextInt();
		}
		System.out.println("Result :");
		
		for (int j : value) {
		    if (j % 2 == 0) {
		        list1.add(j);
		    } else {
		    	list2.add(j);

		    }
		}
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("even" +list1);
		System.out.println("odd" +list2);
		
		
	}
	
	
	    }
