package com.patterns.creational.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static Creator creator = null;
	
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = null;
			while(true){
				str = reader.readLine();
				if(str.equals("close")){
					reader.close();
				}else{
					launch(str);
					creator = null;
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void config(String key){
		switch (key) {
		case "cat":
			creator = new CreateCat();
			break;
		case "dog":
			creator = new CreateDog();
			break;
		default: System.out.println("please pass correct parameter");
			break;
		}
	}
	
	public static void launch(String key){
		config(key);
		if(creator != null) creator.showAnimal();
	}

}
