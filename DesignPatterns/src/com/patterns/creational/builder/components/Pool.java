package com.patterns.creational.builder.components;



public class Pool {
	
	private int deep = 0;
	private int width = 0;
	private int length = 0;
	
	public Pool(int deep, int width, int length){
		this.deep = deep;
		this.length = length;
		this.width = width;
		if(deep != 0 && width !=0 && length != 0) notification();
	}
	
	private void notification(){
		System.out.println("Pool was create, with next params "+"deep: "+deep+", width: "+width+", length: "+length);
	}

}
