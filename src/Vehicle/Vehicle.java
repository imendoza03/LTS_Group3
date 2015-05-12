package Vehicle;

import LuxMap.RoadSection;

public class Vehicle {

	
	private RoadSection road; //Road used by a vehicle
	private String plate; //Vehicle's plate number
	private double distance; //The distance ran by a vehicle on the specified road.
	
	
	public Vehicle(RoadSection road){
		this.road = road;
		road.addVehicle(this);
		
	}
	
	public Vehicle(RoadSection road, String plate){
		this(road);
		this.plate = plate;
		
	}

	public RoadSection getRoad() {
		return road;
	}

	public void setRoad(RoadSection road) {
		this.road = road;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
}
