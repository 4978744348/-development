package com.patterns.creational.factoryMethod;

public class CreateCat extends Creator{

	@Override
	public Action createAnimal() {
		return new Cat();
	}
	
	

}
