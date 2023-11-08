package com.adventure.park;

public class Attraction {
    private int duration;

    public Attraction(int duration) {
        if(duration>60)
            this.duration=60;
        else if(duration<5)
            this.duration=5;
        else
            this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration>=5&&duration<=60)
            this.duration = duration;
    }
}
