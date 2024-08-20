package demo;

import java.util.HashSet;

public class InterView {

	public static void main(String[] args) {
		String st = "deeepaak";
		HashSet<Character> set = new HashSet<>();
		for(char ch : st.toCharArray())
		{
			if(!set.contains(ch))
			{
				set.add(ch);
				System.out.print(ch);
			}
		
			
				
		}
	
}


}

