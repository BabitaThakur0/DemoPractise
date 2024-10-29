package AccenturePrepare;

import java.util.Scanner;

public class RemoveDuplicateFromSring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		System.out.println("Result : "+RemoveDuplicate(str));

	}

	private static String RemoveDuplicate(String str) {
		String result = "";
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(result.indexOf(c) == -1)
			{
				result += c;
			}
			
		}
		return result;
	}
	}


