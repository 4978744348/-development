package com.patterns.creational.builder.builders;


import com.patterns.creational.builder.ExpensiveHouse;
import com.patterns.creational.builder.components.Garage;
import com.patterns.creational.builder.components.Pool;
import com.patterns.creational.builder.components.Roof;
import com.patterns.creational.builder.components.enumConst.Type;

public class ExpensiveHouseBuilder implements Builder {
	
	private Type type;
	private int room;
	private Pool pool;
	private int window;
	private Garage garage;
	private Roof roof;

	@Override
	public void setType(Type type) {
		this.type = type;
		
	}

	@Override
	public void setRooms(int room) {
		this.room = room;
		System.out.println("----------");
		System.out.println("Home has: "+room+" room(s)");
		System.out.println("----------");
		
	}

	@Override
	public void setPool(Pool pool) {
		this.pool = pool;
		
		if(pool == null) {
			System.out.println("----------");
			System.out.println("Home without pool");
			System.out.println("----------");
		}
		
	}

	@Override
	public void setWindow(int window) {
		this.window = window;
		System.out.println("----------");
		System.out.println("Home has: "+window+" window(s)");
		System.out.println("----------");
		
	}

	@Override
	public void setGarage(Garage garage) {
		this.garage = garage;
		
		if(garage == null) {
			System.out.println("----------");
			System.out.println("Home without garage");
			System.out.println("----------");
		}
		
	}

	@Override
	public void setRoof(Roof roof) {
		this.roof = roof;
	}
	
	public ExpensiveHouse getResult(){
		return new ExpensiveHouse(type, room, pool, window, garage, roof);
	}

}
