package com.celfocus.assessment.java.animalfarm.animal.dog;

import com.celfocus.assessment.java.animalfarm.animal.IAnimal;

/**
 * Dog class
 *
 */
public class Dog implements IAnimal {

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String speak() {
		return "Woof";
	}

	@Override
	public String getSpeciesName() {
		return "Dog";
	}

	@Override
	public String getName() {
		return name;
	}
}
