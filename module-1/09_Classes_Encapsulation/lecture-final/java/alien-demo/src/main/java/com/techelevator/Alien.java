package com.techelevator;

// a class is a blueprint or a template that describes all Aliens
public class Alien {
    // define the properties, or data members, or members, attributes, instance variables,
    // fields, class variables
    //  These properties will be PRIVATE!!!!
    private String color;
    private String planetOfOrigin;
    private int antennaeCount;
    private String favoriteFood;
    private boolean isFriendly;

    // constructors
    // a constructor is a special method named the same as the class
    // it HAS NO RETURN TYPE!!!!!
    public Alien(String color, String planetOfOrigin, int antennaeCount,
                 String favoriteFood, boolean isFriendly) {
        // this is a quick way to initialize values for your properties
        this.color = color;
        this.planetOfOrigin = planetOfOrigin;
        this.antennaeCount = antennaeCount;
        this.favoriteFood = favoriteFood;
        this.isFriendly = isFriendly;
    }

    // default constructor
    public Alien(){

    }

    // write setters and getters
    // create methods that define the behaviors -- typically public
    // setters let us modify the values in the properties
    // getters return the values stored in the properties

    // setter will have the value to assign the property with as a parameter
    // mutator
    public void setColor(String color){
        this.color = color;  // this means this object's property
    }

    // getter will return the value in the property
    // accessor
    public String getColor(){
        return this.color;
    }

    public void setPlanetOfOrigin(String planetOfOrigin){
        this.planetOfOrigin = planetOfOrigin;
    }

    public String getPlanetOfOrigin(){
        return this.planetOfOrigin;
    }

    public void setAntennaeCount(int antennaeCount){
        this.antennaeCount = antennaeCount;
    }

    public int getAntennaeCount(){
        return this.antennaeCount;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood(){
        return this.favoriteFood;
    }

    public boolean isFriendly() {  // getters are different for booleans
        return this.isFriendly;
    }

    public void setFriendly(boolean friendly) {
        this.isFriendly = friendly;
    }
}
