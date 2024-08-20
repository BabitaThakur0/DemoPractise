package Questions;

public class interview {

	public static void main(String[] args) {
	String name = "Babita";
	int start = 0;
	int end = name.length()-1;
	char temp;
	 String newString = null;
	 char[] ch = name.toCharArray();
    int count = 0;
    
    while(start<=end)
    {
    
    
         temp = ch[start];
         ch[start] = ch[end];
         ch[end] =temp;
        // count++;
         start++;
         end--;
        // System.out.println("temp :" +temp);
         newString = new String(ch);
         System.out.println("Result :" +newString);

    }
  //  System.out.println("Result :" +newString);

	}

	}




