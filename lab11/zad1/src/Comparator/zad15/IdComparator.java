package Comparator.zad15;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }

}
