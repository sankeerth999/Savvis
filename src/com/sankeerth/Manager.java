package com.sankeerth;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

	static Double allocation = new Double("300");
	private List<Employee> employees = new ArrayList<>();
	
	Manager(){}

	@Override
	public Double getAllocation() {
		Double totalAllocation = Manager.allocation;
		for(Employee e: employees){
			totalAllocation = totalAllocation + e.getAllocation();
		}
		return totalAllocation;
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	};


}
