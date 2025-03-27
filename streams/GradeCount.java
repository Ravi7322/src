package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Learner {
    private String grade;

    public Learner(String name, String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
public class GradeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Learner> learners = Arrays.asList(
		            new Learner("Alice", "A"),
		            new Learner("Bob", "B"),
		            new Learner("Charlie", "A"),
		            new Learner("David", "C"),
		            new Learner("Eve", "B"),
		            new Learner("Frank", "A"),
		            new Learner("Grace", "C")
		        );

		        Map<String, Long> gradeCount = learners.stream()
		            .collect(Collectors.groupingBy(Learner::getGrade, Collectors.counting()));

		        gradeCount.forEach((grade, count) -> {
		            System.out.println("Grade " + grade + ": " + count);
		        });

	}

}
