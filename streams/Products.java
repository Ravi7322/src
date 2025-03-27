package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class NumberUtils {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 10, 15, 17, 18, 20, 23);
	        
	        Map<String, List<Integer>> groupedNumbers = numbers.stream()
	            .collect(Collectors.groupingBy(num -> NumberUtils.isPrime(num) ? "Prime" : "Non-Prime"));
	        
	        groupedNumbers.forEach((key, value) -> {
	            System.out.println(key + ": " + value);
	        });
	        
	        List<String> products = Arrays.asList("Laptop", "Desktop", "Mouse", "Keyboard", "Monitor", "USB Cable", "Printer");
	        
	        Map<String, List<String>> categorizedProducts = products.stream()
	            .collect(Collectors.groupingBy(product -> categorizeProduct(product)));
	        
	        categorizedProducts.forEach((category, productList) -> {
	            System.out.println(category + ": " + productList);
	        });
	    }
	    
	    private static String categorizeProduct(String product) {
	        if (Arrays.asList("Laptop", "Desktop").contains(product)) return "Computer";
	        if (Arrays.asList("Mouse", "Keyboard", "Monitor").contains(product)) return "Peripheral";
	        return "Accessory";

	}

}
