package AccenturePrepare;

import java.util.Scanner;

public class reversetheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		System.out.println("Result : "+reverseString(str));

	}

	private static String reverseString(String str) {
		
		String reverseSt = " ";
		for(int i = str.length()-1; i>=0; i--)
		{
			reverseSt += str.charAt(i); 
		}
		
		
		return reverseSt;
	}

}
