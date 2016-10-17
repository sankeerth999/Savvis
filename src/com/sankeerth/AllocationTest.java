package com.sankeerth;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AllocationTest {

	public AllocationService service;
	
	@Test
	public void test1(){
		//Test when manager has a manager a developer and a QA tester working for him
		
		Employee managerA = new Manager();
		Double expectedAllocation = new Double("2100");
		
		Manager managerA1 = new Manager();
		managerA1.add(new QATester());
		managerA1.add(new Developer());
		
		managerA.add(managerA1);
		
		service = new AllocationService(managerA);
		Assert.assertNotNull(service);
		Assert.assertEquals(service.getAllocation(), expectedAllocation);
		System.out.println("Manager A is allocated: " + service.getAllocation());
	}
	
	@Test
	public void test2(){
		
		Employee corporate = new Department();
		Double expectedAllocation = new Double("7400");
		
		Manager managerJava = new Manager();
		managerJava.add(new Developer());
		managerJava.add(new Developer());
		managerJava.add(new Developer());
		managerJava.add(new QATester());
		managerJava.add(new QATester());
		
		Manager managerSQL = new Manager();
		managerSQL.add(new Developer());
		managerSQL.add(new Developer());
		managerSQL.add(new QATester());
		
		Manager managerFinance = new Manager();
		
		corporate.add(managerJava);
		corporate.add(managerSQL);
		corporate.add(managerFinance);
		
		service = new AllocationService(corporate);
		Assert.assertNotNull(service);
		Assert.assertEquals(service.getAllocation(), expectedAllocation);
		System.out.println("Corporate Department is allocated: " + service.getAllocation());
	
	}
}
