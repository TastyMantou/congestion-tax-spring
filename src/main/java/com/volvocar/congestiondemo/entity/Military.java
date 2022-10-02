package com.volvocar.congestiondemo.entity;

public class Military implements Vehicle {
		private String vehicleType;
	
		public Military() {
			this.vehicleType = "Military";
		}
		@Override
		public String getVehicleType() {
	        return this.vehicleType;
	    }
}
