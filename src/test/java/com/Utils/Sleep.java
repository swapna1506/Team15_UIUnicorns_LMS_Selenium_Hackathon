package com.Utils;

public class Sleep {

	public static void sleep(long miliseconds) {
		if(ConfigReader.getInvocationMode().equalsIgnoreCase("demo")) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}