package com.fatorymethod.logistics;

/**
 * @author yameng.dym
 */
public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("transport by truck");
    }
}
