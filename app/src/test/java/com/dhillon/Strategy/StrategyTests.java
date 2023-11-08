package com.dhillon.Strategy;

import com.dhillon.Strategy.FlyBehaviour.FlyNoWay;
import com.dhillon.Strategy.QuackBehaviour.Squeak;
import org.junit.jupiter.api.Test;

public class StrategyTests {

    @Test
    void mullardDuckTest(){
        Duck mullardDuck = new MullardDuck();
        mullardDuck.display();
        mullardDuck.performQuack();
        mullardDuck.performFly();
        mullardDuck.setFlyBehavior(new FlyNoWay());
        mullardDuck.setQuackBehavior(new Squeak());
        mullardDuck.performQuack();
        mullardDuck.performFly();
    }

    @Test
    void rubberDuckTest(){
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }

}
