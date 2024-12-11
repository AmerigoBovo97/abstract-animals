package org.absct.animals;

abstract public class Animal {
    
    public void sleep(){
        System.out.println("ZZZzzz...");
    }

    abstract public void sound();

    abstract public void eat();
}
