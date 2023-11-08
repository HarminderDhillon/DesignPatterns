package com.dhillon.Strategy;

import com.dhillon.Strategy.FlyBehaviour.FlyNoWay;
import com.dhillon.Strategy.QuackBehaviour.Squeak;

public class RubberDuck extends Duck {

    RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am rubber duck, can't fly only squeak!");
    }
}
