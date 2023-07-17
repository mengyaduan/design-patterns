package com.creational_patterns.singleton.multi_dcl;

public class Singleton {
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            System.out.println("进入同步锁了！");
            if (instance == null) {
                instance = new Singleton(value);
                System.out.println("进入同步锁，还创建了！");
            }
            return instance;
        }
    }
}
