package com.patterns.creational.singleton.singleThread;

/**
 * Singleton is a creational design pattern, 
 * which ensures that only one object of its kind exists and 
 * provides a single point of access to it for any other code
 */
public class MainSingleThread {

	public static void main(String[] args) {
		Singleton singletone = Singleton.getInstance();
		if (singletone instanceof Singleton) {
			System.out.println("single thread Singletone is created");
		}
	}

}
