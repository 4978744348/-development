package com.patterns.creational.singleton.singleThread;

/**
 * single thread Singleton
 */
public class Singleton {

	private static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
