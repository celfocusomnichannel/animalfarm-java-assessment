package com.celfocus.assessment.java.animalfarm;

import java.util.Arrays;
import java.util.List;

import com.celfocus.assessment.java.animalfarm.animal.IAnimal;
import com.celfocus.assessment.java.animalfarm.animal.chicken.Chicken;
import com.celfocus.assessment.java.animalfarm.animal.cow.Cow;
import com.celfocus.assessment.java.animalfarm.animal.dog.Dog;
import com.celfocus.assessment.java.animalfarm.farm.Farm;

public class Main {

	public static void main(String[] args) {
		Farm farm = new Farm();

		List<IAnimal> dogsAndCows = Arrays.asList(
				new Dog("Fido"),
				new Dog("Rex"),
				new Cow("Mimosa"),
				new Cow("Vigor"));
		addAnimals(farm, dogsAndCows);

		findRexTheDog(farm);

		findJayTheCow(farm);

		List<IAnimal> chickens = Arrays.asList(
				new Chicken("Rex"),
				new Chicken("Clotilde"),
				new Chicken("Joaquina"),
				new Chicken("Maria"));
		addAnimals(farm, chickens);

		findRexTheChicken(farm);

		countAnimalSpecies(farm);
	}

	private static void addAnimals(Farm farm, List<IAnimal> animals) {
		for (int i = 0; i < animals.size(); i++) {
			farm.addAnimal(animals.get(i));
		}
	}

	private static void findRexTheDog(Farm farm) {
		IAnimal rex = farm.search("Fido");
		System.out.println("Rex the Dog says: " + rex.speak());
	}

	private static void findJayTheCow(Farm farm) {
		IAnimal jay = farm.search("Jay");
		System.out.println("Jay the Cow says: " + jay.speak());
	}

	private static void findRexTheChicken(Farm farm) {
		IAnimal rex = farm.search("Rex");
		System.out.println("Rex the Chicken says: " + rex.speak());
	}

	private static void countAnimalSpecies(Farm farm) {
		List<IAnimal> animals = farm.getAnimals();
		int[] counter = new int[3];
		for(IAnimal a : animals){
			if(a.getSpeciesName().equalsIgnoreCase("cow")){
				counter[0]++;
			}
		}
		for(IAnimal a : animals){
			if(a.getSpeciesName().equalsIgnoreCase("dog")){
				counter[1]++;
			}
		}
		for(IAnimal a : animals){
			if(a.getSpeciesName().equalsIgnoreCase("chicken")){
				counter[2]++;
			}
		}
		System.out.println(counter[0] + " Cows, " + counter[1] + " Dogs and " + counter[2] + " Chickens");
	}

}