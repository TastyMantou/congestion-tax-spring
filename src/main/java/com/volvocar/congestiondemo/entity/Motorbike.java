package com.volvocar.congestiondemo.entity;

import java.util.*;
import java.text.*;

public class Motorbike implements Vehicle {
	
	private String vehicleType;
	
	public Motorbike() {
		this.vehicleType = "Motorbike";
	}
	
    @Override
    public String getVehicleType() {
        return this.vehicleType;
    }
}
