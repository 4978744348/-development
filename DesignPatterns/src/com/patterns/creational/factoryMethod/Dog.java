package com.patterns.creational.factoryMethod;

public class Dog implements Action {

	@Override
	public void doEat() {
		System.out.println("Dog likes to eat meat");
		
	}

	@Override
	public void doSay() {
		System.out.println("Dog says - gauuu!");
		
	}

}
