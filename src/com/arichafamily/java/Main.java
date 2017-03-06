package com.arichafamily.java;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Car c = new Car();
        c.drive();
        c.log("Start driving");
        c.turn(30);
        c.log("Turning by 30 degrees");
        c.drive();
        c.print();

        System.out.println(Car.DRIVER_TAG);
*/

        Timer t = new Timer();
        DriveTask task = new DriveTask();
        //t.schedule(task, 5*1000);
        t.scheduleAtFixedRate(task, 0, 2*1000);
    }
}
