package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class FlightEngine implements Engine {

    @Override
    public void start() {
        System.out.println("start by jet engine");
    }
}
