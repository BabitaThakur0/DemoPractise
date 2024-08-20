package Questions;

import java.util.Scanner;

public class checkingforDuplicatecharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for string");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for(int i = 0; i < st.length();i++){
			for(int j = i+1; j<st.length();j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println("Result : "+ch[j]);
					break;
				}
			
			}
				
		}
	}

}
