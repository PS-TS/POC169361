package Comparator.zad15;

import java.util.Comparator;

public class AverageGradeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getAverageGrade(), student1.getAverageGrade());
    }
}
