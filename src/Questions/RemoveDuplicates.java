package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,4,7,2,9,1,6,8,3,2,5,3,1));
		
		List<Integer> listValue = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(listValue);
		System.out.println("Result: "+listValue);

	}
	

}
