package compare.zad1;

public class Student implements Comparable<Student>{
    public String name;
    public double averageGrade;
    public int yearofBirth;

    public Student(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String toString() {
        return "Student averageGrade=" + averageGrade;
    }

    public int compareTo(Student o) {
        if(this.averageGrade>o.averageGrade) return 1;
        if(this.averageGrade==o.averageGrade) return 0;
        return -1;
    }
}
