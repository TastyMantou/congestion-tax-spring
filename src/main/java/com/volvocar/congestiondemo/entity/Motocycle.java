package com.volvocar.congestiondemo.entity;

public class Motocycle implements Vehicle{
		private String vehicleType;
	
		public Motocycle() {
			this.vehicleType = "Motocycle";
		}
	
	
	   @Override
		public String getVehicleType() {
	        return this.vehicleType;
	    }
}
