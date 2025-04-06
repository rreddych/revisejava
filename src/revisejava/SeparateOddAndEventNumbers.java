package revisejava;

import java.util.Arrays;
import java.util.List;

public class SeparateOddAndEventNumbers {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		listOfIntegers.stream().filter(i -> i%2 ==0).forEach(i -> System.out.println(i));
		listOfIntegers.stream().filter(i -> i%2 !=0).forEach(i -> System.out.println(i));
	}
}