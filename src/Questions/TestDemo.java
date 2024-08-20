package Questions;

import java.util.HashSet;
import java.util.Scanner;

public class TestDemo {

	/*

given string s, find the length ofthe longest substring without repeating characters

input = "abcabcbb"

output: abc -> 3

2. input : "bbbbb" 
 
output : b -> 1 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sctring : ");
		String st = sc.next();
		int count = 0;
		
		HashSet<Character> set = new HashSet<Character>();
		for(char c : st.toCharArray())
		{
			if(!set.contains(c))
			{
				set.add(c);
				
				
				count++;
			}
			else 
			{
				set.remove(c);
				count--;
			}
			
		}
		System.out.println("Result : "+count);
		System.out.println("Result : "+set);
		
		
		
		
		

	}

}
