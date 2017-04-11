package com.xyzcompany;

public enum Coin {
	PENNY(0.003, 0.003, 0.004), 
	NICKEL(0.01,0.02,0.02), 
	DIME(0.04,0.04,0.02), 
	QUARTER(0.12,0.10,0.03);
	
	private double value;
	
	private Coin(double weight, double dimension, double thickness) {
		value = weight + dimension + thickness;
	}
	
	public double getValue() {
		return value;
	}
}
