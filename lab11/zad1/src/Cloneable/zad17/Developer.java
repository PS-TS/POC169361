package Cloneable.zad17;

class Developer implements Cloneable {
    public String name;
    public int age;
    public double salary;

    public Developer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Developer clone() {
        try {
            return (Developer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
