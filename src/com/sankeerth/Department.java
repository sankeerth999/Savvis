package com.sankeerth;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {

	private List<Employee> employees = new ArrayList<>();
	
	public Department(){};
	
	@Override
	public Double getAllocation() {
		Double totalAllocation = new Double("0");
		for(Employee e: employees){
			totalAllocation = totalAllocation + e.getAllocation();
		}
		return totalAllocation;
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

}
