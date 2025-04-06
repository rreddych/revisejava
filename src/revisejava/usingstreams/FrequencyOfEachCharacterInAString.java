package revisejava.usingstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInAString {

	public static void main(String[] args) {
		
		String sampleString = "iamlookingtofindfrequencyofeachcharinastring";
		char[] charArray = sampleString.toCharArray();
		List<Character> characterList = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			characterList.add((Character) charArray[i]);
		}
		
		characterList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
	}
}
