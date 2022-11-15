package com.celfocus.assessment.java.animalfarm.animal.cow;

import com.celfocus.assessment.java.animalfarm.animal.IAnimal;

/**
 * Cow class
 *
 */
public class Cow implements IAnimal {

	private String name;

	public Cow(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String speak() {
		return "Mooooo";
	}

	@Override
	public String getSpeciesName() {
		return "Cow";
	}

}
