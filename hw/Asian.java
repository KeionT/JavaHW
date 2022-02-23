package com.injection.hw;

import org.springframework.stereotype.Component;

@Component
public class Asian {
	//Properties
	private String make;
	private String model;
	
	public Asian() {
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Asian [make=" + make + ", model=" + model + "]";
	}

}
