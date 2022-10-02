package com.volvocar.congestiondemo.web.service;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.volvocar.congestiondemo.CongestionTaxCalculator;
import com.volvocar.congestiondemo.entity.TaxCalVehicle;


@RestController
@RequestMapping(value="/gettax")
public class CongestionTaxCalcuatorServiceController {

    @Autowired
    private CongestionTaxCalculator congestionTaxCalculator;

    @RequestMapping(method= RequestMethod.GET, value="/{vehicle}")
    public String getTollForVehicle(@PathVariable(value="vehicle")String vehicleTyple){
    	//TaxCalVehicle taxCalVehicle = new TaxCalVehicle(vehicleTyple);
    	Date currentDate = new Date();
    	vehicleTyple = vehicleTyple.substring(0,1).toUpperCase() + vehicleTyple.substring(1).toLowerCase();
    	return getTollForVehicle(vehicleTyple, currentDate.getTime());
    	
    }
    
    @RequestMapping(method= RequestMethod.GET, value="/{vehicle}/{epochtime}")
    public String getTollForVehicle(@PathVariable(value="vehicle")String vehicleTyple, @PathVariable(value="epochtime") long epochtime){
    	vehicleTyple = vehicleTyple.substring(0,1).toUpperCase() + vehicleTyple.substring(1).toLowerCase();
    	TaxCalVehicle taxCalVehicle = new TaxCalVehicle(vehicleTyple);
    	Date date = new Date(epochtime);
    	int tollAmount = this.congestionTaxCalculator.GetTollFee(date, taxCalVehicle);
    	NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(tollAmount) ;
    }
    
    @RequestMapping(method= RequestMethod.GET, value="/test")
    public String test(){
    	return "Test successfully completed";
    }
    
  
}
