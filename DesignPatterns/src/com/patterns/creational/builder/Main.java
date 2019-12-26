package com.patterns.creational.builder;

import com.patterns.creational.builder.builders.CheapHouseBuilder;
import com.patterns.creational.builder.builders.ExpensiveHouseBuilder;
import com.patterns.creational.builder.builders.LuxaryHouseBuilder;
import com.patterns.creational.builder.ExpensiveHouse;

public class Main {

	public static void main(String[] args) {
		init();
	}

	private static void init() {
		Director director = new Director();

		CheapHouseBuilder cheapHouseBuilder = new CheapHouseBuilder();
		director.constructCheapHouse(cheapHouseBuilder);

		CheapHouse cheapHouse = cheapHouseBuilder.getResult();
		cheapHouse.setFolks(3);
		System.out.println("Cheap house built: " + cheapHouse.getType());
		System.out.println("==============================================");

		ExpensiveHouseBuilder expensiveHouseBuilder = new ExpensiveHouseBuilder();
		director.constructExpensiveHouse(expensiveHouseBuilder);

		ExpensiveHouse expensiveHouse = expensiveHouseBuilder.getResult();
		System.out.println("Expensive house built: " + expensiveHouse.getType());
		System.out.println("==============================================");

		LuxaryHouseBuilder luxaryHouseBuilder = new LuxaryHouseBuilder();
		director.constructLuxaryHouse(luxaryHouseBuilder);

		LuxaryHouse luxaryHouse = luxaryHouseBuilder.getResult();
		System.out.println("Luxary house built: " + luxaryHouse.getType());
		System.out.println("==============================================");
	}

}
