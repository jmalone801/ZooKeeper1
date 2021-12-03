package com.zoo1;

public class Gorilla extends Mammal {
	public Gorilla (int energyLevel) {
		super(energyLevel);
	}
	public int throwSomething() {
		System.out.println("Im throwing something!!");
		return energyLevel -= 5;
	}
	
	public int eatBananas() {
		System.out.println("Im eating a banana!!");
		return energyLevel += 10;
	}
	
	public int climb() {
		System.out.println("Im climbing a tree!!");
		return energyLevel -= 10;
	}

	
}
