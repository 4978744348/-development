package com.patterns.creational.factoryMethod;

public abstract class Creator {
	
	public  void  showAnimal(){
		Action act = createAnimal();
		act.doEat();
		act.doSay();
	}
	
	public abstract Action createAnimal();

}
