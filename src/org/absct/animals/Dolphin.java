package org.absct.animals;

public class Dolphin extends Animal implements Swimming{
    
    @Override
    public void sound(){
        System.out.println("noi delfini ci avvaliamo di suoni per l'ecolocalizzazione, ma come le nostre parenti orche abbiamo un complesso sistema linguistico per comunicare tra di noi");
    }

    @Override
    public void eat(){
        System.out.println("fish");
    }

    @Override
    public void swim(){
        System.out.println("EHI GUARDAMI STO NUOTANDO VUOI  FARE UN GIRO?");
    }
}
