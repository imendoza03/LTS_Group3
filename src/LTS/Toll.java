package LTS;

import java.util.Date;

import LuxMap.RoadSection;

public class Toll {


	/**
	 * This class defines the data related to Toll. Such as plate number, road section, the entering date to a section as well as exit date.
	 * 
	 */
	
	RoadSection road;
	Date enteringDate;
	Date exitDate;
	double fee;
	
	Toll(RoadSection road, String plate){
		this.road = road;
		this.enteringDate = new Date();
		this.exitDate = null;
		this.fee = road.getGeneratedFee();
		
	}
	
	
	


	public RoadSection getRoad() {
		return road;
	}

	public void setRoad(RoadSection road) {
		this.road = road;
	}

	public Date getEnteringDate() {
		return enteringDate;
	}

	public void setEnteringDate(Date enteringDate) {
		this.enteringDate = enteringDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
