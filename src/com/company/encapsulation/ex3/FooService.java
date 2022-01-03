package com.company.encapsulation.ex3;

import static com.company.encapsulation.ex3.TimeUnit.MILLISECOND;

public class FooService {

    public void fooOld() {
        Timer t = new Timer();
        t.startTime = System.currentTimeMillis();

        t.stopTime = System.currentTimeMillis();

        long elaspedTime = t.stopTime - t.startTime;
    }

    public void foo() {
        Timer t = new Timer();
        t.start();

        t.end();

        long time = t.elapsedTime(MILLISECOND);
    }
}
