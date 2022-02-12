package com.techelevator.farm;

/*
public final class Cat extends FarmAnimal {
this causes SiameseCat to not work
final means you cannot have any children
nothing can inherit from the class
 */
public class Cat extends FarmAnimal{

    public Cat() {
        super("Cat", "meow");
    }

   /*   Because the parent class FarmAnimals said the method getSound
        is final, in cannot be overridden

   public String getSound() {
        return "meow";
    }*/

}
