package com.main;

import com.model.Car;
//import com.model.Vehicle;

public class AbsMain extends Thread {

	public static void main(String[] args) {
		
		try {
			long start = System.currentTimeMillis();
			Car veh1 = new Car();
			veh1.accelerate();
			veh1.accelerate();
			System.out.println(veh1.getSpeed());
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			veh1.accelerate();
			System.out.println(veh1.getSpeed());
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			veh1.stop();
			System.out.println(veh1.getSpeed());
			System.out.println(veh1.getSpeed());
			System.out.print("Time taken : ");
			System.out.println((System.currentTimeMillis()-start)+" ms");
			sleep(10000);
			
			System.out.print("Time taken : ");
			System.out.println((System.currentTimeMillis()-start)+" ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
