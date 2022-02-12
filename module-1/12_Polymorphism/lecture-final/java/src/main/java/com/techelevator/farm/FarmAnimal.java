package com.techelevator.farm;

public class FarmAnimal implements Singable{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	@Override // we add this @Override to tell everyone
	// this is the method we are providing the body of
	// from the Singable interface
	public String getName() {
		return name;
	}

	@Override
	public String getSound() {
		return sound;
	}

}