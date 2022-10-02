package com.volvocar.congestiondemo.entity;

import java.util.*;
import java.text.*;

public class Car implements Vehicle {
	
	private String vehicleType;
	
	public Car() {
		this.vehicleType = "Car";
	}
	 @Override
    public String getVehicleType() {
        return this.vehicleType;
    }
}
