package com.patterns.creational.prototype;

public class Dog extends Animal {

	private int age;

	public Dog() {

	}

	public Dog(Dog target) {
		super(target);
		if (target != null) {
			this.age = target.age;
		}
	}

	@Override
	public Animal clone() {
		return new Dog(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Dog || super.equals(obj)) {
			Dog dog = (Dog) obj;
			return dog.age == age;
		}
		return false;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
