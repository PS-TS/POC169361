public class Time{
    int hours;
    int minutes;
    public Time addTime(Time otherTime){
        Time newtime = new Time();
        newtime.hours = hours;
        newtime.minutes = minutes;
        newtime.minutes+= otherTime.minutes;
        if(newtime.minutes>59){
            newtime.hours+=(newtime.minutes/60);
            newtime.minutes%=60;
        }
        newtime.hours+=otherTime.hours;
        if(newtime.hours>23)
            newtime.hours%=24;
        return newtime;
    }
}