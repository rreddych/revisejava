package com.learn.usingstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfDecimalsInReverseOrder {

	public static void main(String[] args) {
		List<Double> doubleList = Arrays.asList(23.0, 56.7, 89.3,12.4, 52.6, 22.5);
		// sorted in natural (ascending) order.
		doubleList.stream().sorted().forEach(System.out::println);
		// sort in reverse (descending) order 
		System.out.println("Sorted in reverse order: ");
		doubleList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
