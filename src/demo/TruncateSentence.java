package demo;

import java.util.Scanner;

public class TruncateSentence {
	/*
	 A sentence is a list of words that are separated by a single space with no leading or trailing spaces
     Each of the words consists of only uppercase and lowercase English letters (no punctuation).
     
     For example, "Hello World" "HELLO", and "hello world hello world" are all sentences
     You are given a sentence s and an integer k. You want to truncates such that it contains only the first k words.
     Return s after truncating it.

     Example 1:
     Input: s = "Hello how are you Contestant", k
     Output: "Hello how are you"
     Explanation:
     The words in s are "Hello", "how", "are", "you","Contestant" J.
     the first 4 words are "Hello" "how" "are" "you" "you",
Hence, you should return "Hello how are you".
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string :");
		String s = sc.nextLine();
		System.out.println("enter thr truncated value :");
		int n = sc.nextInt();
		
		System.out.println("Result :"+truncateSentence(s,n));
		

	}

	public static String truncateSentence(String s,int k) {
		int specialcount = 0;
		int len = s.length();
		for(int i= 0 ;i<len; i++)
		{
			if(s.charAt(i) == ' ')
			{
				specialcount++;
				if(specialcount == k)
				{
					return s.substring(0, i);
				}
			}
		}
		return s;
	}

}

/*
 enter the string :
Hello how are you Contestant
enter thr truncated value :
4
Result :Hello how are you
*/
