package org.example.strategyPattern.DuckProblemSolution.flying;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        actuallyFly();
    }

    private void actuallyFly(){
        // this is for the birds that actually flies in the sky.
        System.out.println("Flying in the sky using wings");
    }
}
