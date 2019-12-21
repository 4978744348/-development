package com.patterns.creational.factoryAbstract.furnitereImpl;

import com.patterns.creational.factoryAbstract.furniture.Sofa;
import com.patterns.creational.factoryAbstract.furniture.StyleFactory;
import com.patterns.creational.factoryAbstract.furniture.Table;


/**
 * concrete factory
 */
public class ModernFactory implements StyleFactory{

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public Table createTable() {
		return new ModernTable();
	}

}
