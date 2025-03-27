package streams;
import java.util.*;
import java.util.stream.Collectors;

public class VowlsCons {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "ravi", "teja");
        
        Map<String, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(name -> isVowel(name.charAt(0)) ? "Vowel" : "Consonant"));
        
        System.out.println("Words grouped by starting letter:");
        groupedWords.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}