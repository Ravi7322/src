package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Employee {
    String name;
    String department;
    int experience;

    public Employee(String name, String department, int experience) {
        this.name = name;
        this.department = department;
        this.experience = experience;
    }
}
public class CountEmplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "HR", 5),
	            new Employee("Bob", "IT", 8),
	            new Employee("Charlie", "Finance", 3),
	            new Employee("David", "IT", 10),
	            new Employee("Eve", "HR", 2),
	            new Employee("Frank", "Finance", 6),
	            new Employee("Grace", "IT", 4)
	        );

	        Map<String, Map<String, Long>> groupedEmployees = employees.stream()
	            .collect(Collectors.groupingBy(emp -> emp.department, 
	                Collectors.groupingBy(emp -> categorizeExperience(emp.experience), Collectors.counting())));

	        groupedEmployees.forEach((department, expMap) -> {
	            System.out.println("Department: " + department);
	            expMap.forEach((expLevel, count) -> 
	                System.out.println("  " + expLevel + ": " + count));
	        });
	    }

	    private static String categorizeExperience(int experience) {
	        if (experience < 3) return "Junior";
	        else if (experience < 7) return "Mid-Level";
	        else return "Senior";
		

	}

}
