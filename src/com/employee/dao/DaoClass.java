package com.employee.dao;

import java.util.HashMap;

import com.employee.bean.Employee;

/**
 * @author Mri scan
 *
 */
public class DaoClass implements DaoInterface {
	
	private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	
	/**
	 *
	 */
	@Override
	public void storeIntoMap(Employee emp)
	{
		this.employeeMap.put(emp.getEid(), emp);
		
	}
	
	/**
	 *
	 */
	@Override
	public HashMap<Integer, Employee> displayEmployees()
	{
		return this.employeeMap;
	}
	
	/**
	 *
	 */
	@Override
	public boolean isMapEmpty()
	{
		return this.employeeMap.isEmpty();
	}
	
	/**
	 *
	 */
	@Override
	public void removeFromMap(Integer removeId)
	{
		this.employeeMap.remove(removeId);
	}
	
}
