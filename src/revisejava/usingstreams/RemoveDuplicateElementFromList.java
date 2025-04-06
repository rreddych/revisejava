package revisejava.usingstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromList {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 22, 21, 67, 32, 22, 14, 56, 71);
		listOfIntegers.stream().distinct().forEach(i -> {
			System.out.print(i + " ");
		});	
		
		System.out.println("\nSorted Distinct Elements: ");
		
		listOfIntegers.stream().distinct().sorted().forEach(i -> {
			System.out.print(i + " ");
		});
		
		// Using Collectors.toSet() to remove duplicates
		System.out.println("\nDistinct Elements using Collectors.toSet(): ");
		listOfIntegers.stream().collect(Collectors.toSet()).forEach(i -> {
			System.out.print(i + " ");
		});
	}
}