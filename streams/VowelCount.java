package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        Map<Integer, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(word -> countVowels(word)));

        groupedWords.forEach((key, value) -> System.out.println("Vowel Count " + key + ": " + value));
    }

    private static int countVowels(String word) {
        return (int) word.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

	}

}
