package com.model;

public class Car extends Vehicle {

	public void accelerate() {
		if(this.speed+10<=200) {
		this.speed=this.speed+10;
		}else {
			this.speed=200;
		}
		
	}

	public void decelerate() {
		if(this.speed-10>=0) {
			this.speed=this.speed-10;
		}else {
			this.speed=0;
		}
			
	}
	public void stop() {
		this.speed=0;
	}

}
