package com.sankeerth;

public class QATester implements Employee{

	static Double allocation = new Double("500");
	
	QATester(){
		
	}

	@Override
	public Double getAllocation() {
		return QATester.allocation;
	}

	@Override
	public void add(Employee employee) {
	};
	
	
}
