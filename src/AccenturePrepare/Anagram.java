package AccenturePrepare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string ");
		String str1 = sc.nextLine();
		System.out.println("enter second string ");
		String str2 = sc.nextLine();
		System.out.println("Result : "+ anagramString(str1,str2));
		
	    
		

	}

	private static boolean anagramString(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    
		return Arrays.equals(ch1, ch2);
	}

}
