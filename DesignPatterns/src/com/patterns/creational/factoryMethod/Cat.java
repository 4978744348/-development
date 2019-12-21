package com.patterns.creational.factoryMethod;

public class Cat implements Action{

	@Override
	public void doEat() {
		System.out.println("Cat likes to eat fish");
		
	}

	@Override
	public void doSay() {
		System.out.println("Cat says - myauuu!");
		
	}

}
