package AccenturePrepare;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		System.out.println("Result : "+PalindromeString(str));

	}

	private static boolean PalindromeString(String str) {
		String reverseStr = "";
		for(int i = str.length()-1; i>=0 ; i--)
		{
		
			reverseStr += str.charAt(i);
			
		}

		return str.equals(reverseStr);
	}																											
	}


