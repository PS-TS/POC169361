package Cloneable.zad17;

class SeniorDeveloper extends Developer {
    public double bonus;

    public SeniorDeveloper(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public SeniorDeveloper clone() {

        SeniorDeveloper clonedSeniorDeveloper = (SeniorDeveloper) super.clone();
        clonedSeniorDeveloper.bonus = this.bonus;
        return clonedSeniorDeveloper;
    }

    public String toString() {
        return "SeniorDeveloper{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
