package demo;

import java.util.Scanner;

public class ReverseString_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		char ch[] = str.toCharArray();
		int end = ch.length-1;
		int start = 0;
		char temp;
		while(start<end)
		{
		temp = ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
		start++;
		end--;
		
		}
		String st = new String(ch);
		System.out.println("string value : "+ st);
		
	}
		

	

}
/*
Enter String :
Hello
string value : olleH

*/