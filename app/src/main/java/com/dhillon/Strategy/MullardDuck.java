package com.dhillon.Strategy;

import com.dhillon.Strategy.FlyBehaviour.FlyWithWings;
import com.dhillon.Strategy.QuackBehaviour.Quack;

public class MullardDuck extends Duck {

    public MullardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am Mullard duck!");
    }
}
