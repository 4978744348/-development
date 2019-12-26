package com.patterns.creational.builder.components;

import com.patterns.creational.builder.components.enumConst.Color;
import com.patterns.creational.builder.components.enumConst.TypeRoof;

public class Roof {

	private TypeRoof typeRoof;
	private Color color;

	public Roof(TypeRoof typeRoof, Color color) {
		this.typeRoof = typeRoof;
		this.color = color;
		notification();
	}

	private void notification() {
		System.out.println("----------");
		System.out.println("Roof was created, with next props- type roof: " + typeRoof + ", color: " + color);
		System.out.println("----------");
	}

}
