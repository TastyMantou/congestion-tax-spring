package com.volvocar.congestiondemo.entity;

public class TaxCalVehicle implements Vehicle{
	private String vehicleType;
	
	public TaxCalVehicle(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String getVehicleType() {
		return this.vehicleType;
	}
	

}
