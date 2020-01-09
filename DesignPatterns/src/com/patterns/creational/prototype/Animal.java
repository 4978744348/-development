package com.patterns.creational.prototype;

import java.util.Objects;

/**
 * general interface
 */
public abstract class Animal {

	private int height;
	private int weight;
	private String color;

	public Animal() {

	}

	public Animal(Animal target) {
		if (target != null) {
			this.height = target.height;
			this.weight = target.weight;
			this.color = target.color;
		}
	}

	public abstract Animal clone();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal man = (Animal) obj;
			return man.height == height && man.weight == weight && Objects.equals(man.color, color);
		}
		return false;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
