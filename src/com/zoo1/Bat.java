package com.zoo1;

public class Bat extends Mammal{
	public Bat (int energyLevel) {
		super(energyLevel);
	}

	public int fly() {
		System.out.println("Im a flying bat!!");
		return energyLevel -= 50;
	}
	
	public int eatHumans() {
		System.out.println("Im eating a human!!");
		return energyLevel += 25;
	}
	
	public int attackTown() {
		System.out.println("Im attacking the town!!");
		return energyLevel -= 100;
	}
	

}
