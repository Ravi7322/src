package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(5, 12, 17, 25, 32, 45, 56, 68, 75, 89, 95, 102);

        Map<String, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> isPrime(n) ? "Prime" : "Not Prime"));

        groupedNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;

	}

}
