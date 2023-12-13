package math.trigonometry;

public class SimpleTrigonometryCalculator implements TrigonometryCalculator{

    public double calculateSin(int angle) {
        if(angle==0)
            return 0;
        return (3.14159*angle)/180;
    }


    public boolean isAcuteAngle(int angle) {
        if(angle>0&&angle<90)
            return true;
        return false;
    }
}
