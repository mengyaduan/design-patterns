package com.fatorymethod.logistics;

/**
 * @author yameng.dym
 */
public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("transport by ship");
    }
}
