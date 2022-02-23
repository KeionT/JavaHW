package com.injection.hw;

import org.springframework.stereotype.Component;

@Component 
public class Cars {
	
	//Properties
	private String color;
	private int year;
	private int cost;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Cars [color=" + color + ", year=" + year + ", cost=" + cost + "]";
	}

}
