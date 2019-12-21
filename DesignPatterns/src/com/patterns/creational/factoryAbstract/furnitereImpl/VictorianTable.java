package com.patterns.creational.factoryAbstract.furnitereImpl;

import com.patterns.creational.factoryAbstract.furniture.Table;

public class VictorianTable implements Table {

	@Override
	public void makeStyle() {
		System.out.println("victorian table was created");
		
	}

}
