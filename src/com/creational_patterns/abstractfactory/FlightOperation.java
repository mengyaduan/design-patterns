package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class FlightOperation implements Operation {
    @Override
    public void operate() {
        System.out.println("operate by yoke");
    }
}
