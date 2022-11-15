package com.celfocus.assessment.java.animalfarm.animal;

/**
 * <p>
 * Interface of an Animal
 * </p>
 * 
 * Each animal produces its own sound when it speaks.<br>
 * Each animal has a name and a species.
 *
 */
public interface IAnimal {

	/**
	 * Retrieves the name of the animal
	 * @return Animal name
	 */
	public String getName();

	/**
	 * Retrieves the species of the animal
	 * @return Species name
	 */
	public String getSpeciesName();

	/**
	 * Produces the sound the animal makes when it speaks
	 * @return Animal speech sound
	 */
	public String speak();
}
