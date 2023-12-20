package Cloneable.zad11;

public class Athlete implements Cloneable{
    public String name;
    double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times;
    }

    public double[] getTimes() {
        return times;
    }

    public Athlete clone() {
        try {
            Athlete clonedAthlete = (Athlete) super.clone();
            clonedAthlete.times = times.clone();
            return clonedAthlete;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }
}
