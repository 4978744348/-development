package com.patterns.creational.factoryAbstract.furnitereImpl;

import com.patterns.creational.factoryAbstract.furniture.Table;

public class ModernTable implements Table {

	@Override
	public void makeStyle() {
		System.out.println("modern table was create");
		
	}

}
