package org.absct.animals;

public class Sparrow extends Animal implements Flying{

    @Override
    public void sound(){
        System.out.println("chip");
    }

    @Override
    public void eat(){
        System.out.println("insects ann seeds");
    }

    @Override
    public void fly(){
        System.out.println("I'm volanding");
    }
}