package com.employee.service;

import java.util.HashMap;

import com.employee.bean.Employee;

/**
 * @author Mri scan
 *
 */
public interface ServiceInterface {
	
	void storeIntoMap(Employee emp); 
	HashMap<Integer, Employee> displayEmployees();
	boolean isMapEmpty();
	void removeFromMap(Integer removeId);
	
}
