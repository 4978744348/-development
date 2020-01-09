package com.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype is a creational design pattern that allows cloning objects, even
 * complex ones, without coupling to their specific classes.
 */
public class MainPrototype {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		List<Animal> animalCopy = new ArrayList<>();

		Cat cat = new Cat();
		cat.setAge(3);
		cat.setColor("gray");
		cat.setHeight(15);
		cat.setWeight(7);
		animals.add(cat);

		Dog dog = new Dog();
		dog.setAge(12);
		dog.setColor("marron");
		dog.setHeight(50);
		dog.setWeight(45);
		animals.add(dog);

		cloneAndCompare(animals, animalCopy);
	}

	public static void cloneAndCompare(List<Animal> animals, List<Animal> animalCopy) {
		for (Animal animal : animals) {
			animalCopy.add(animal.clone());
		}

		for (byte i = 0; i < animals.size(); i++) {
			if (animals.get(i).equals(animalCopy.get(i))) {
				System.out.println(animals.get(i).getClass() + " equals animal copy");
			} else {
				System.out.println(animals.get(i).getClass() + " not equals animal copy");
			}
		}
	}

}
