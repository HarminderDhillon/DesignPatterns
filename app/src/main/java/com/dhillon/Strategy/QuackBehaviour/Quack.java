package com.dhillon.Strategy.QuackBehaviour;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack quack quack");
    }
}
