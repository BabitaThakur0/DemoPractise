package Questions;

import java.util.Scanner;

public class countNoofVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
	    String st = sc.nextLine();
	   st= st.toLowerCase();
	   int count =0;
	   for(int i = 0; i<st.length();i++)
	   {
		   if(st.charAt(i) == 'a' ||st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' )
		   {
			   count++;
		   }
		   
		   
	   }
	   System.out.println("No of vowels "+count);

	  
	}
	

}
