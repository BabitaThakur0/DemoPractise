package AccenturePrepare;

import java.util.Scanner;

public class countVowlesAndConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		int vowels = 0, constant = 0;
		for(int i = 0 ;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isLetter(c))
			{
			if("AEIOUaeiou".indexOf(c) != -1)
			{
				vowels++;
			}
			else 
			{
			constant++;
		}
			}
	}
		System.out.println("vowels :"+vowels +"constant : " +constant);

}
	}
