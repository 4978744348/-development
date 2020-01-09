package com.patterns.creational.singleton.multiThread;

public class MainMultiThread {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		if (singleton instanceof Singleton) {
			System.out.println("multi thread Singletone is created");
		}
	}

}
