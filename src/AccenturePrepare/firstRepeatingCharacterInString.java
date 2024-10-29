package AccenturePrepare;

import java.util.Scanner;

public class firstRepeatingCharacterInString {

	/*
	 
	 Input s = "snowforsnow"
	 output = 0
	 
	 Input "abcdef"
	 output = -1
	 
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		System.out.println("Result : "+RepeatingCharacterInString(str));

	}

	private static char RepeatingCharacterInString(String str) {
		
		for(int i = 0; i<str.length() ; i++)
		{
			char c = str.charAt(i);
			for(int j =i+1; j<str.length();j++)
			{
				if(c == str.charAt(j))
				{
					return c;
				}
			}
			
		}
		return '\0';
		
	}

}
