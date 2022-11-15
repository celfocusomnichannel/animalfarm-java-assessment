package com.celfocus.assessment.java.animalfarm.farm;

import java.util.ArrayList;
import java.util.List;

import com.celfocus.assessment.java.animalfarm.animal.IAnimal;

/**
 * A Farm is a building containing several animals of different kinds
 *
 */
public class Farm {

	/**
	 * List of animals in the farm
	 */
	List<IAnimal> animals;

	public Farm() {
		animals = new ArrayList<>();
	}

	/**
	 * Adds a new animal to the farm
	 * @param animal Animal to be added to the farm
	 */
	public void addAnimal(IAnimal animal) {
		animals.add(animal);
	}

	/**
	 * Looks for an animal with a given name
	 * @param name Name to look for
	 * @return Animal with that name
	 */
	public IAnimal search(String name) {
		return null;
	}

	/**
	 * Retrieves all the animals added to the farm
	 * @return
	 */
	public List<IAnimal> getAnimals(){
		return animals;
	}

}
