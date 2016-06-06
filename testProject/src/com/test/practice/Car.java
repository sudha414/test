package com.test.practice;

public class Car {
	
	protected int wheelCount;
	private String vin;
	
	public Car(){
		
	}
	
	public Car(String vin){
		this.vin = vin;
		this.wheelCount = 4;
	}
	
	public String drive(){
		return "zoom zoom";
	}
	
	public String getInfo(){
		return "VIN " +vin+ "No of wheels "+wheelCount;
	}
	

}
