package com.dsczs.javadsczsdesignpattern.create.single.four;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
