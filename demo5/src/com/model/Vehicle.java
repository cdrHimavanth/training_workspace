package com.model;

public abstract class Vehicle {
	private int cost;
	private int noOfWheels;
	protected int speed;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void start() {
		System.out.println("The vehicle has been started!!");
	};
	public abstract void accelerate();
	public abstract void decelerate();
}
