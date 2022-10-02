package com.volvocar.congestiondemo.entity;

public class Emergency implements Vehicle {
	private String vehicleType;
	
	public Emergency() {
		this.vehicleType = "Emergency";
	}
	
	@Override
	public String getVehicleType() {
		return this.vehicleType;
	}

}
