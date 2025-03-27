package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Worker {
    private String department;
    private int experience;

    public Worker(String name, String department, int experience) {
        this.department = department;
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }
}

public class Excprience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Worker> workers = Arrays.asList(
		            new Worker("Alice", "HR", 5),
		            new Worker("Bob", "IT", 8),
		            new Worker("Charlie", "Finance", 3),
		            new Worker("David", "IT", 10),
		            new Worker("Eve", "HR", 2),
		            new Worker("Frank", "Finance", 6),
		            new Worker("Grace", "IT", 4)
		        );

		        Map<String, Map<String, Long>> groupedWorkers = workers.stream()
		            .collect(Collectors.groupingBy(
		                Worker::getDepartment,
		                Collectors.groupingBy(
		                    emp -> categorizeExperience(emp.getExperience()), Collectors.counting()
		                )
		            ));

		        groupedWorkers.forEach((department, expMap) -> {
		            System.out.println("Department: " + department);
		            expMap.forEach((expLevel, count) -> {
		                System.out.println("  " + expLevel + ": " + count);
		            });
		        });
		    }

		    private static String categorizeExperience(int experience) {
		        if (experience < 3) return "Junior";
		        else if (experience < 7) return "Mid-Level";
		        else return "Senior";
	}

}
