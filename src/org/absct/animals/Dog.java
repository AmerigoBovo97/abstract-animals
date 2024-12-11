package org.absct.animals;

public class Dog extends Animal{
    
    @Override
    public void sound(){
        System.out.println("Bau!!");
    }

    @Override
    public void eat(){
        System.out.println("Crocchette e wurstel");
    }

}
