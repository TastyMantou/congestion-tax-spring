package com.volvocar.congestiondemo.entity;

public class Foreign implements Vehicle {
	
	private String vehicleType;
	
	public Foreign() {
		this.vehicleType = "Foreign";
	}
	@Override
	public String getVehicleType() {
		return this.vehicleType;
	}

}
