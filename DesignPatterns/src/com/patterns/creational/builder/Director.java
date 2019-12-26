package com.patterns.creational.builder;

import com.patterns.creational.builder.builders.Builder;
import com.patterns.creational.builder.components.Garage;
import com.patterns.creational.builder.components.Pool;
import com.patterns.creational.builder.components.Roof;
import com.patterns.creational.builder.components.enumConst.Color;
import com.patterns.creational.builder.components.enumConst.Type;
import com.patterns.creational.builder.components.enumConst.TypeRoof;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

	public void constructCheapHouse(Builder builder) {
		builder.setType(Type.CHEAP_HOUSE);
		builder.setRooms(1);
		builder.setPool(null);
		builder.setWindow(2);
		builder.setGarage(null);
		builder.setRoof(new Roof(TypeRoof.FLAT, Color.BLACK));
	}

	public void constructExpensiveHouse(Builder builder) {
		builder.setType(Type.EXPENSIVE_HOUSE);
		builder.setRooms(4);
		builder.setPool(null);
		builder.setWindow(8);
		builder.setGarage(new Garage(Color.BLACK, 2, true, false));
		builder.setRoof(new Roof(TypeRoof.PITCHED, Color.RED));
	}

	public void constructLuxaryHouse(Builder builder) {
		builder.setType(Type.LUXARY_HOUSE);
		builder.setRooms(10);
		builder.setPool(new Pool(3, 15, 30));
		builder.setWindow(22);
		builder.setGarage(new Garage(Color.WHITE, 2, true, true));
		builder.setRoof(new Roof(TypeRoof.ATTIC, Color.BLUE));
	}

}
