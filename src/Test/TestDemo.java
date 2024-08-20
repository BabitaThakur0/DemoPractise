package Test;

public class TestDemo {

	public static void main(String[] args) {
		        String str = "java is a programming language";
		        String st = "abcdefghijklmnopqrstuvwxyz";
		        int count;

		        for (int i = 0; i < st.length(); i++) {
		            count = 0;
		            for (int j = 0; j < str.length(); j++) {
		                if (st.charAt(i) == str.charAt(j)) {
		                    count++;
		                }
		            }
		            System.out.println(st.charAt(i) + ": " + count);
		        }
		    }
		
	}


