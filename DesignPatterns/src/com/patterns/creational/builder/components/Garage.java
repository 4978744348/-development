package com.patterns.creational.builder.components;

import com.patterns.creational.builder.components.enumConst.Color;

public class Garage {
	
	private Color color;
	private int countDoor;
	private boolean hasWindow;
	private boolean hasPit;
	
	
	
	public Garage(Color color, int doors, boolean window, boolean pit ){
		this.color = color;
		this.countDoor = doors;
		this.hasWindow = window;
		this.hasPit = pit;
		notification();
	} 
	
	private void notification(){
		final String window = hasWindow ?  "window is installed" :  "no window";
		final String pit = hasPit ? "pit is installed" : "no pit";
		String info = "Garage was created, with next props-  color "+color+", doors: "+countDoor+", "+window+", "+pit;
		System.out.println(info);
		
	}
	

}
