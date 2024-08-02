package LargeAssignment;

import java.util.HashSet;
import java.util.Set;

public class AllVowel {
    public static int findShortestVowelSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> foundVowels = new HashSet<>();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int end = 0; end < input.length(); end++) {
            char endChar = Character.toLowerCase(input.charAt(end));
            if (vowels.contains(endChar)) {
                foundVowels.add(endChar);
            }
            while (foundVowels.size() == vowels.size()) {
                minLength = Math.min(minLength, end - start + 1);
                char startChar = Character.toLowerCase(input.charAt(start));
                if (vowels.contains(startChar)) {
                    foundVowels.remove(startChar);
                    for (int i = start + 1; i <= end; i++) {
                        if (vowels.contains(Character.toLowerCase(input.charAt(i)))) {
                            foundVowels.add(Character.toLowerCase(input.charAt(i)));
                            start = i;
                            break;
                        }
                    }
                }
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        String input = "aeiobcdouie";
        int result = findShortestVowelSubstring(input);
        System.out.println("The length of the shortest substring containing all vowels is: " + result);
    }
}

