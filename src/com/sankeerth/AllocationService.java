package com.sankeerth;

public class AllocationService {

	private Employee employee;
	
	public AllocationService(Employee employee){
		super();
		this.employee = employee;
	}
	
	public Double getAllocation(){
		return employee.getAllocation();
	}
}
