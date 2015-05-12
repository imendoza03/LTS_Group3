package LuxMap;

import java.util.ArrayList;

import Vehicle.Vehicle;

public class RoadSection {

	/**
	 * Pre-defined road sections
	 */
	
	private ArrayList<Vehicle> vehicles;
	private double generatedFee;
	private double roadLenght;
	private boolean charged;
	private int roadID;
	private CheckPoint start;
	private CheckPoint end;
	
	
	public RoadSection(int roadID, CheckPoint start, CheckPoint end){
		this.vehicles = new ArrayList<>();
		this.roadID = roadID;
		this.start = start;
		this.end = end;
		
	}


	public ArrayList<Vehicle> getVehicule() {
		return vehicles;
	}


	public void setVehicule(ArrayList<Vehicle> vehicule) {
		this.vehicles = vehicule;
	}


	public double getGeneratedFee() {
		return generatedFee;
	}


	public void setGeneratedFee(double generatedFee) {
		this.generatedFee = generatedFee;
	}


	public int getRoadID() {
		return roadID;
	}


	public void setRoadID(int roadID) {
		this.roadID = roadID;
	}


	public CheckPoint getStart() {
		return start;
	}


	public void setStart(CheckPoint start) {
		this.start = start;
	}


	public CheckPoint getEnd() {
		return end;
	}


	public void setEnd(CheckPoint end) {
		this.end = end;
	}
	
	/**
	 * This method adds or assign a vehicle to a road section.
	 * @param vehicle : vehicle entering to a predefined road section.
	 */
	
	public void addVehicle(Vehicle vehicle){
		
	}
	
	/**
	 * This method removes a vehicle from a road section.
	 */
	
	public void removeVehicle(Vehicle vehicle){
		
	}
	
	/**
	 * This method return the list of all the vehicles added to road sections
	 */
	
	public ArrayList<Vehicle> getVehicles(){
		return this.vehicles;
	}
	
	
}
