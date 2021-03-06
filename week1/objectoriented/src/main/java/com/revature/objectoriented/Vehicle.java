package com.revature.objectoriented;

public class Vehicle {
	
	//final means a field can't be changed
	static final Integer NUMBER_OF_WHEELS = 4;
	Double fuel;
	Boolean running;
	Integer topSpeed;
	String color;
	String model;
	
	//This is the same as the default constructor
	Vehicle() {
		super();
	}
	
	//This is another constructor (overloading)
	Vehicle(Double fuel, Integer topSpeed, String color, String model) {
		super();
		this.fuel = fuel;
		this.running = false;
		this.topSpeed = topSpeed;
		this.color = color;
		this.model = model;
	}
	
	//This is a wacky case for example
	Vehicle(String wackyNameForColor) {
		super();
		this.model = wackyNameForColor;
		this.color = "Blue";
		this.topSpeed = wackyNameForColor.length();
	}
	
	void drive() throws OutOfFuelException {
		if (this.fuel > 0 && this.running) {
			System.out.println("Vroom.");
			this.fuel -= 1.0; //this.fuel = this.fuel - 1.0;
		} else {
			throw new OutOfFuelException();
		}
	}
	
	public void turnOn() {
		this.running = true;
	}
	
	void turnOff() {
		this.running = false;
	}
	
	public void refuel(Double amount) {
		if (amount > 0.0) {
			this.fuel += amount;
		} else {
			System.out.println("Failed to refuel");
		}
	}

	@Override
	public String toString() {
		return "Vehicle [fuel=" + fuel + ", running=" + running + ", topSpeed=" + topSpeed + ", color=" + color
				+ ", model=" + model + ", NUMBER_OF_WHEELS=" + NUMBER_OF_WHEELS + "]";
	}
	
	

}
