import java.util.*;

public class UniqueCount {
    public static char CountofUniqueString(String str) {
        int index = -1;
        HashMap<Character, Integer> Freq = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = Freq.getOrDefault(ch, 0);
            Freq.put(ch, frequency + 1);
        }

        // Step 2: Find first unique character
        for (int i = 0; i < str.length(); i++) {
            if (Freq.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        // Step 3: Print and return result
        if (index != -1) {
            char uniqueChar = str.charAt(index);
            System.out.println("First unique character is '" + uniqueChar + "' at index " + index);
            return uniqueChar;
        } else {
            System.out.println("No unique character found.");
            return '\0'; // null character indicates not found
        }
    }

    public static void main(String[] args) {
        char result1 = CountofUniqueString("hello");
        System.out.println(result1);

    }
}
