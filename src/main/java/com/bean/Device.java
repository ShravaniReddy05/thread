package com.bean;

public class Device {
	private String deviceName;
    private int daysOnRent;
    private Location location ;
    
    public Device()
    {
    }
    
    
    
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", daysOnRent=" + daysOnRent + ", location=" + location + "]";
	}
	public Device(String deviceName, int daysOnRent, Location location) {
		super();
		this.deviceName = deviceName;
		this.daysOnRent = daysOnRent;
		this.location = location;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getDaysOnRent() {
		return daysOnRent;
	}
	public void setDaysOnRent(int daysOnRent) {
		this.daysOnRent = daysOnRent;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
    
    
	
	

}
