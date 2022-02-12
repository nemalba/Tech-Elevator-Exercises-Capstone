package com.techelevator.farm;

/*
  abstract means you cannot create an instance (an object)
  of this class
  abstract at the class level also means you
  can have an abstract method declared in here
  an abstract method is one without a body
 */
public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;  // property

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		this.isAsleep = false;  // all animals are awake by default
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( ) {  // final means no children can override this
		//									 method!
		return sound;
	}

	public void sleep() {
		isAsleep = true;  // this objects property isAsleep
		this.sound = "Zzzzzzz";
	}

//	public abstract void eat();  // an abstract method is one with no body
}