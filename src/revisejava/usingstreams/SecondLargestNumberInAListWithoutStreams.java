package revisejava.usingstreams;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNumberInAListWithoutStreams {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(76, 34, 80, 12 , 90, 56, 81);
		//Doing just enough passes for optimization ( 2 passes)
		for (int j = 0; j < 2; j++) {
			for(int i= 0; i<integerList.size()-1; i++) {
				if(integerList.get(i) > integerList.get(i+1)) {
					integerList.set(i, integerList.get(i) + integerList.get(i+1));
					integerList.set(i+1, integerList.get(i) - integerList.get(i+1));
					integerList.set(i, integerList.get(i) - integerList.get(i+1));
				}
			}
			
		}	
		System.out.println("Second Largest number: " + integerList.get(integerList.size()-2));

	}
}