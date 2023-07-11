package com.creational_patterns.fatorymethod.logistics;

/**
 * @author yameng.dym
 */
public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("transport by ship");
    }
}
