package Questions;

import java.util.Scanner;

public class ReverseofString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :");
	String st1 = sc.nextLine();
	char[] ch = st1.toCharArray();
	int i = 0;
	int j = ch.length-1;
	char temp = ' ';
	while(i<j)
	{
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
	}
	String stValue = new String(ch);
	System.out.println("Result :"+stValue);
		}

}
