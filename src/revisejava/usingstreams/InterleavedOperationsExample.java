package revisejava.usingstreams;

import java.util.Arrays;
import java.util.List;

public class InterleavedOperationsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
            .filter(number -> {
                System.out.println("Filtering: " + number);
                return number % 2 == 0;
            })
            .peek(number -> System.out.println("Peeking: " + number))
            .forEach(number -> System.out.println("ForEach: " + number));
    }
}

