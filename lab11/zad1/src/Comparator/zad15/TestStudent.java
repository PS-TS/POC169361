package Comparator.zad15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Adam", 4.5));
        students.add(new Student(2, "Alex", 4.4));
        students.add(new Student(3, "Alicja", 4.6));
        students.add(new Student(4, "Adrian", 4.3));
        students.add(new Student(5, "Anna", 4.7));

        Collections.sort(students, new AverageGradeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, new IdComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
