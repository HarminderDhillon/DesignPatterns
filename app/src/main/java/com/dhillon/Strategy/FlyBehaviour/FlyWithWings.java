package com.dhillon.Strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
