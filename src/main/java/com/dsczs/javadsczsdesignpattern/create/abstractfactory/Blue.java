package com.dsczs.javadsczsdesignpattern.create.abstractfactory;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
