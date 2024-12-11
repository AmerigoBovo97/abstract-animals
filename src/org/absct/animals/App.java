package org.absct.animals;
public class App {
    public static void main(String[] args) throws Exception {

        Animal animal_1 = new Dog();
        Dolphin animal_2 = new Dolphin();
        Eagle animal_3 = new Eagle();

        animal_1.sleep();
        animal_1.sound();
        animal_1.eat();

        animal_2.sleep();
        animal_2.sound();
        animal_2.eat();

        animal_3.sleep();
        animal_3.sound();
        animal_3.eat();

        makeItFly(animal_3);
        makeItSwim(animal_2);
    }

    static void makeItFly(Flying flying){
        flying.fly();
    }

    static void makeItSwim(Swimming swimming){
        swimming.swim();
    }
}
