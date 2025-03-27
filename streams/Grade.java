package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> students = Arrays.asList(
		            new Student("Alice", "A"),
		            new Student("Bob", "B"),
		            new Student("Charlie", "A"),
		            new Student("David", "C"),
		            new Student("Eve", "B"),
		            new Student("Frank", "A"),
		            new Student("Grace", "C")
		        );

		        Map<String, List<Student>> groupedStudents = students.stream()
		            .collect(Collectors.groupingBy(Student::getGrade));

		        groupedStudents.forEach((grade, studentList) -> {
		            System.out.println("Grade " + grade + ":");
		            studentList.forEach(student -> System.out.println("  " + student.getName()));
		        });

	}

}
