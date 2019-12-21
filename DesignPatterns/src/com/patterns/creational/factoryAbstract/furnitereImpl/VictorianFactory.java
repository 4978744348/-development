package com.patterns.creational.factoryAbstract.furnitereImpl;

import com.patterns.creational.factoryAbstract.furniture.Sofa;
import com.patterns.creational.factoryAbstract.furniture.StyleFactory;
import com.patterns.creational.factoryAbstract.furniture.Table;

/**
 * concrete factory
 */
public class VictorianFactory implements StyleFactory {

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public Table createTable() {
		return new VictorianTable();
	}

}
