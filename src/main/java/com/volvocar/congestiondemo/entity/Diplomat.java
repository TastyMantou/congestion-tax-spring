package com.volvocar.congestiondemo.entity;

public class Diplomat implements Vehicle{
	private String vehicleType;
	
	public Diplomat() {
		this.vehicleType = "Diplomat";
	}
	
	@Override
	public String getVehicleType() {
		return this.vehicleType;
	}
	
}
