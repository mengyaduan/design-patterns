package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class CarEngine implements Engine {

    @Override
    public void start() {
        System.out.println("start by combustion engine");
    }
}
