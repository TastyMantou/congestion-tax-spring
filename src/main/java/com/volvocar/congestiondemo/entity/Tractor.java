package com.volvocar.congestiondemo.entity;

public class Tractor implements Vehicle {
	
	private String vehicleType;
	
	public Tractor() {
		this.vehicleType = "Tractor";
	}
	
	@Override
	public String getVehicleType() {
		return this.vehicleType;
	}

}
