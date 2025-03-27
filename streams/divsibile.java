package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class divsibile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 35, 40, 45, 50, 51, 53, 55);

	        Map<String, List<Integer>> groupedNumbers = numbers.stream()
	                .collect(Collectors.groupingBy(n -> {
	                    if (n % 2 == 0) return "Divisible by 2";
	                    else if (n % 5 == 0) return "Divisible by 5";
	                    else return "Neither";
	                }));

	        groupedNumbers.forEach((key, value) -> System.out.println(key + ": " + value));

	}

}
