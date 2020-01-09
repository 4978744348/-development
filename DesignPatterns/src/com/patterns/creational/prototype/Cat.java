package com.patterns.creational.prototype;

public class Cat extends Animal {

	private int age;

	public Cat() {

	}

	public Cat(Cat target) {
		super(target);
		if (target != null) {
			this.age = target.age;
		}
	}

	@Override
	public Animal clone() {
		return new Cat(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cat || super.equals(obj)) {
			Cat cat = (Cat) obj;
			return cat.age == age;
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
