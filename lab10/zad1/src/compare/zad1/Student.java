package compare.zad1;

public class Student implements Comparable{
    public String name;
    public double averageGrade;
    public int yearofBirth;

    public Student(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearofBirth=" + yearofBirth +
                '}';
    }

}
