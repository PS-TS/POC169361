package Comparator.zad15;

public class Student {
    public int id;
    public String name;
    public double averageGrade;

    public Student(int id, String name, double averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

