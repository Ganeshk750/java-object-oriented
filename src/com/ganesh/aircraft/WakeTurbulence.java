package com.ganesh.aircraft;


/**
 * @created: 16/04/2021 - 3:11 PM
 * @author: Ganesh
 */


public enum WakeTurbulence {
    LIGHT(60),
    MEDIUM(90),
    HEAVY(110),
    SUPER(180);

    private int timeOffset;

    WakeTurbulence(int timeOffset){
        this.timeOffset = timeOffset;
    }

    public int getTimeOffset() {
        return timeOffset;
    }

}
