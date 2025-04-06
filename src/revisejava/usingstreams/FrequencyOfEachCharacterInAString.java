package revisejava.usingstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInAString {

	public static void main(String[] args) {
		
		String sampleString = "iamlookingtofindfrequencyofeachcharinastring";
		char[] charArray = sampleString.toCharArray();
		List<Character> characterList = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			characterList.add((Character) charArray[i]);
		}
		
		
		characterList.stream().collect(Collectors.groupingBy(c -> c)).entrySet().stream().map(e -> {
			System.out.println("Character: " + e.getKey() + " Frequency: " + e.getValue().size());
			return e;
		}).forEach(System.out::println);
		
	}

}
