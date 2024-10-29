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
		int start = 0;
		

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

		  // If the character is already in the set, slide the left pointer to the right
            while (set.contains(c)) {
                set.remove(st.charAt(start));
                start++;
            }

            // Add the current character to the set
            set.add(c);
            System.out.println("Result : "+set);
    		
    		

            // Update the maximum length of substring found so far
           count = Math.max(count, start - i + 1);
			
		}
		System.out.println("Result : "+count);
		
		
		
	
	}

}
