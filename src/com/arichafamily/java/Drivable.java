package com.arichafamily.java;

/**
 * Created by hackeru on 06/03/2017.
 */
public interface Drivable {
    String DRIVER_TAG = "Drivable";
    void drive();
    void turn(double degrees);
    default void print(){
        System.out.println("I am drivable");
    }
    default void log(String message){
        System.out.println(DRIVER_TAG + " " + message);
    }
}
