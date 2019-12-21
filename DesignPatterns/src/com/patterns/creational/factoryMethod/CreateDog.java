package com.patterns.creational.factoryMethod;

public class CreateDog extends Creator {

	@Override
	public Action createAnimal() {		
		return new Dog();
	}

}
