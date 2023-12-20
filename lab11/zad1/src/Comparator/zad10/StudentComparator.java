package Comparator.zad10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        int gradeComparison = Double.compare(student2.getAverageGrade(), student1.getAverageGrade());

        if (gradeComparison != 0) {
            return gradeComparison;
        }
        return student1.getName().compareTo(student2.getName());
    }
}
