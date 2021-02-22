package com.employee.service;

import java.util.HashMap;

import com.employee.bean.Employee;
import com.employee.dao.DaoClass;
import com.employee.dao.DaoInterface;

/**
 * @author Mri scan
 *
 */
public class ServiceClass implements ServiceInterface {
	
	DaoInterface dao = new DaoClass();
	
	
	/**
	 *
	 */
	@Override
	public void storeIntoMap(Employee emp)
	{
		dao.storeIntoMap(emp);
	}
	
	/**
	 *
	 */
	@Override
	public HashMap<Integer, Employee> displayEmployees()
	{
		return dao.displayEmployees();
	}
	
	/**
	 *
	 */
	@Override
	public boolean isMapEmpty()
	{
		return dao.isMapEmpty();
	}
	
	/**
	 *
	 */
	@Override
	public void removeFromMap(Integer removeId)
	{
		dao.removeFromMap(removeId);
	}
}
