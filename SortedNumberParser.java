import java.util.*;
import java.util.stream.Collectors;

public class SortedNumberParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas, spaces, or both:");
        String input = scan.nextLine();

        List<Integer> sortedNumbers = Arrays.stream(input.trim().split("[,\\s]+"))
            .map(Integer::parseInt)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedNumbers);
    }
}

//array list linked list stack queue 