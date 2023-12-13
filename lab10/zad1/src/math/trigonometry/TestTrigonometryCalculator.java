package math.trigonometry;

public class TestTrigonometryCalculator {
    public static void main(String[] args){
        SimpleTrigonometryCalculator s1 = new SimpleTrigonometryCalculator();
        SimpleTrigonometryCalculator s2 = new SimpleTrigonometryCalculator();
        System.out.println(s1.calculateSin(30));
        System.out.println(s2.calculateSin(60));
        System.out.println(s1.isAcuteAngle(45));
        System.out.println(s2.isAcuteAngle(80));
    }
}
