package com.patterns.creational.singleton.singleThread;

public class MainSingleThread {

	public static void main(String[] args) {
		Singleton singletone = Singleton.getInstance();
		if (singletone instanceof Singleton) {
			System.out.println("single thread Singletone is created");
		}
	}

}
