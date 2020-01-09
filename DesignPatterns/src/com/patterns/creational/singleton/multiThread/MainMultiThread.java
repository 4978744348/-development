package com.patterns.creational.singleton.multiThread;

/**
 * Singleton is a creational design pattern, 
 * which ensures that only one object of its kind exists and 
 * provides a single point of access to it for any other code
 */
public class MainMultiThread {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		if (singleton instanceof Singleton) {
			System.out.println("multi thread Singletone is created");
		}
	}

}
