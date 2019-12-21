package com.patterns.creational.factoryAbstract.furniture;


/**
 * abstract factory
 */
public interface StyleFactory {
	
	Sofa createSofa();
	Table createTable();

}
