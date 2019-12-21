package com.patterns.creational.factoryAbstract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.patterns.creational.factoryAbstract.app.Application;
import com.patterns.creational.factoryAbstract.furnitereImpl.ModernFactory;
import com.patterns.creational.factoryAbstract.furnitereImpl.VictorianFactory;
import com.patterns.creational.factoryAbstract.furniture.StyleFactory;

public class Main {
	
	public static void main(String[] args){
		Application app = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = null;
			while(true){
				str = reader.readLine();
				if(str.equals("close")) {
					reader.close();
				}else{
					app = appCfg(str);
					if(app != null) app.makeStyle();
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
	
	
	private static Application appCfg(String design){
		Application app = null;
		StyleFactory styleFactory = null;
		
		switch (design) {
		case "modern":
			styleFactory = new ModernFactory();
			app = new Application(styleFactory);
			break;
		case "victorian" : 
			styleFactory = new VictorianFactory();
			app = new Application(styleFactory);
			break;
		default : System.out.println("pass paramater is not correct");
		 	break;
		}
		return app;
	}

}
