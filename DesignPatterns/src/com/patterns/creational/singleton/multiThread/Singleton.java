package com.patterns.creational.singleton.multiThread;

/**
 * multi thread Singleton
 */
public class Singleton {

	private static volatile Singleton instance = null;

	public static Singleton getInstance() {
		if (instance != null) {
			return instance;
		}
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}
}
