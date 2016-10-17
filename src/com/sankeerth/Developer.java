package com.sankeerth;

public class Developer implements Employee{

	static Double allocation = new Double("1000");
	
	public Developer(){
		
	};
	
	@Override
	public Double getAllocation() {
		return Developer.allocation;
	}

	@Override
	public void add(Employee employee) {
		
	}

}
