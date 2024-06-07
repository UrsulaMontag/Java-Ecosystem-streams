package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Exercise project for streams
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 20, 18, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19));
        List<Integer> evenDoubledSortedNumbers =
                numbers.stream()
                        // Step 1: Filter a list of numbers and only output the even numbers.
                        .filter(n -> n % 2 == 0)
                        // Step 2: Use 'map' to double each number
                        .map(n -> n * 2)
                        // Step 3: Sort the list in ascending order
                        .sorted()
                        .toList();
        // Step 5: Use 'forEach' to output each processed number
        evenDoubledSortedNumbers.forEach(System.out::println);
        System.out.println("Sum of even and doubled numbers 1-20: " + sumUpList(evenDoubledSortedNumbers));
        System.out.println("Sum of even and doubled numbers 1-20: " + sumUpList(numbers));
    }

    // Step 4: Perform a 'reduce' operation to calculate the sum
    public static int sumUpList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static void printProcessedNumbers(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

}
