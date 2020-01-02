package com.lti.jspel;

public class Vehicle {
 int vehicleId;
 String vehiclename;
 
public Vehicle(int vehicleId, String vehiclename) {
	super();
	this.vehicleId = vehicleId;
	this.vehiclename = vehiclename;
}

@Override
public String toString() {
	return "Vehicle [vehicleId=" + vehicleId + ", vehiclename=" + vehiclename + "]";
}

public int getVehicleId() {
	return vehicleId;
}

public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}

public String getVehiclename() {
	return vehiclename;
}

public void setVehiclename(String vehiclename) {
	this.vehiclename = vehiclename;
}
 
	
}
