package com.celfocus.assessment.java.animalfarm.animal.chicken;

import com.celfocus.assessment.java.animalfarm.animal.IAnimal;

/**
 * Chicken class
 *
 */
public class Chicken implements IAnimal {

	private String name;

	public Chicken(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSpeciesName() {
		return "Chicken";
	}

	@Override
	public String speak() {
		return "bock bock bock";
	}

}
