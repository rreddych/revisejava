package revisejava.usingstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEventNumbers {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> seperatedMap = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("Even Numbers: ");
		seperatedMap.get(true).forEach(i -> {
			System.out.print(i + " ");
		});
		System.out.println("\nOdd Numbers: ");
		seperatedMap.get(false).forEach(i -> {
			System.out.print(i + " ");
		});
	}
}