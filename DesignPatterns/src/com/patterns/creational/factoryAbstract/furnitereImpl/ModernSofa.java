package com.patterns.creational.factoryAbstract.furnitereImpl;

import com.patterns.creational.factoryAbstract.furniture.Sofa;

public class ModernSofa implements Sofa {

	@Override
	public void makeStyle() {
		System.out.println("modern sofa was create");		
	}

}
