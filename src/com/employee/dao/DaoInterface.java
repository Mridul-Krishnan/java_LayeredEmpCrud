package com.employee.dao;

import java.util.HashMap;

import com.employee.bean.Employee;

/**
 * @author Mri scan
 *
 */
public interface DaoInterface {
	
	void storeIntoMap(Employee emp);
	HashMap<Integer, Employee> displayEmployees();
	boolean isMapEmpty();
	void removeFromMap(Integer removeId);
}
