package com.bean;

public class Technician {
	private String technicianName;
	private Device device;
	
	public Technician()
	{
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	@Override
	public String toString() {
		return "Technician [technicianName=" + technicianName + ", device=" + device + "]";
	}

	public Technician(String technicianName, Device device) {
		super();
		this.technicianName = technicianName;
		this.device = device;
	}
	
	
	
}
