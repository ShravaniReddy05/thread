package com.bean;

public class Location {
	private String locationName;

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
	public Location()
	{
		
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	
	
}
