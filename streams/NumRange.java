package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class NumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(5, 12, 17, 25, 32, 45, 56, 68, 75, 89, 95, 102);

	        Map<String, List<Integer>> groupedNumbers = numbers.stream()
	                .collect(Collectors.groupingBy(n -> {
	                    if (n <= 20) return "0-20";
	                    else if (n <= 40) return "21-40";
	                    else if (n <= 60) return "41-60";
	                    else if (n <= 80) return "61-80";
	                    else return "81+";
	                }));

	        groupedNumbers.forEach((key, value) -> System.out.println("Range " + key + ": " + value));

	}

}
