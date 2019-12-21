package com.patterns.creational.factoryAbstract.app;

import com.patterns.creational.factoryAbstract.furniture.Sofa;
import com.patterns.creational.factoryAbstract.furniture.StyleFactory;
import com.patterns.creational.factoryAbstract.furniture.Table;

/**
 * client side
 */
public class Application {
	
	private Sofa sofa;
	private Table table;
	
	public Application(StyleFactory styleFactory){
		sofa = styleFactory.createSofa();
		table = styleFactory.createTable();
	}
	
	public void makeStyle(){
		sofa.makeStyle();
		table.makeStyle();
	}
}
