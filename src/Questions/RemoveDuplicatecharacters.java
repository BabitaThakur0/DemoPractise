package Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatecharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int n =ch.length;
		
		removeDuplicate(ch, n);
		

	}

	private static void removeDuplicate(char[] ch, int n) {
		HashSet<Character> hashset = new LinkedHashSet<Character>(n-1);
		for(char x : ch)
		{
			hashset.add(x);
		}
		for(char y : hashset)
			System.out.print(" " +y);
		
	}

	

}
