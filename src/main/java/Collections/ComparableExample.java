package Collections;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int grade;
    private int studentId;

    public Student(String name, int grade, int studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    // Getters
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public int getStudentId() { return studentId; }

    @Override
    public int compareTo(Student other) {
        // Natural order: sort by student ID (ascending)
        // if (-1) ascending that means
        // if (1) descending order
        // if (0) that means an object are equal
        return Integer.compare(this.studentId, other.studentId);
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %d, Grade: %d)", name, studentId, grade);
    }
}

class SortByGrade implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getGrade(),(s1.getGrade()));
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 95, 103),
                new Student("Bob", 80, 101),
                new Student("Aharlie", 80, 102)
        );

//        Collections.sort(students,new SortByGrade()); // Uses natural order (by student ID)
//        students.forEach(System.out::println);
        // Output:
        // Bob (ID: 101, Grade: 90)
        // Charlie (ID: 102, Grade: 80)
        // Alice (ID: 103, Grade: 85)

        // for the complex sorting order first descending sorting order and then ascending order
        students.sort(Comparator.comparing(Student::getGrade).reversed()
                .thenComparing(Student::getName));
        students.forEach(System.out::println);

        String longestName = String.valueOf(Collections.max(students));
        List<Integer> list = new ArrayList<>();



    }
}