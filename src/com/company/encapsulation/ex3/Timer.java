package com.company.encapsulation.ex3;

public class Timer {

    public long startTime;
    public long stopTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(TimeUnit unit) {
        switch (unit) {
            case MILLISECOND:
                return stopTime = startTime;
            default:
                return 0;
        }
    }
}
