package com.injection.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class American {
	//Properties
	private String make;
	private String model;
	
	//est has a relations
	@Autowired
	Cars cars; 
	public American() {
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
		return "American [make=" + make + ", model=" + model + ", cars=" + cars + "]";
	}

}
