package com.patterns.creational.builder;

import com.patterns.creational.builder.components.Garage;
import com.patterns.creational.builder.components.Pool;
import com.patterns.creational.builder.components.Roof;
import com.patterns.creational.builder.components.enumConst.Type;

public class ExpensiveHouse {
	
	private Type type;
	private int room;
	private Pool pool;
	private int window;
	private Garage garage;
	private Roof roof;
	private int folks;
	
	public ExpensiveHouse(Type type, int room, Pool pool, int window, Garage garage, Roof roof) {
		this.type = type;
		this.room = room;
		this.pool = pool;
		this.window = window;
		this.garage = garage;
		this.roof = roof;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Pool getPool() {
		return pool;
	}

	public void setPool(Pool pool) {
		this.pool = pool;
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	public Roof getRoof() {
		return roof;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	public int getFolks() {
		return folks;
	}

	public void setFolks(int folks) {
		this.folks = folks;
		
		if(folks != 0){
			System.out.println("----------");
			System.out.println("Home has: "+folks+" folks");
			System.out.println("----------");
		}
	}
	
	
	
	

}
