package org.absct.animals;

public class Eagle extends Animal implements Flying{

    @Override
    public void sound(){
        System.out.println("chip");
    }

    @Override
    public void eat(){
        System.out.println("Sparrows");
    }

    @Override
    public void fly(){
        System.out.println("I'm volanding but better");
    }
}
