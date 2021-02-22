/**
 * 
 */
package com.employee.ui;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.employee.bean.Employee;
import com.employee.service.ServiceClass;
import com.employee.service.ServiceInterface;

/**
 * @author Mri scan
 *
 */
public class Main {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Employee emp;
		ServiceInterface service = new ServiceClass();
		int n;
		
		System.out.println("*****************Employee Application********************");
		do {
			System.out.println("\n\nSelect Task");
			System.out.println("1. Add employee data");
			System.out.println("2. Show employee data");
			System.out.println("3. Delete employee data");
			System.out.println("4. Update employee data");
			System.out.println("5. Exit");

			n = s.nextInt();

			switch (n) {
			case 1:
				
				try {
					emp = new Employee();
					System.out.println("Enter employee id:");
					emp.setEid(s.nextInt());
					System.out.println("Enter employee name:");
					emp.setEname(s.next());
					System.out.println("Enter employee city:");
					emp.setEcity(s.next());
					System.out.println("Enter employee salary:");
					emp.setEsal(s.nextFloat());
					service.storeIntoMap(emp);
					
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Wrong input type");
				}
				catch(NullPointerException e) {
					System.out.println("Null values entered");
				}
				
				
				
				break;
			case 2:
				if(service.isMapEmpty())
				{
					System.out.println("No data");
					break;
				}
				
				for (Map.Entry<Integer, Employee> entry : service.displayEmployees().entrySet())
					System.out.println("Employee ID:" + entry.getKey() + "\nData:\n" + entry.getValue() + "\n");
				
//				Set<Entry<Integer, Employee>> entry = empData.entrySet();
//				System.out.println(entry);
				
				break;
			case 3:
				System.out.println("Enter employee id to delete: ");
				service.removeFromMap(s.nextInt());
				System.out.println("Deleted successfully");
				break;
			case 4 : 
				emp = new Employee();
				System.out.println("Enter employee id:");
				emp.setEid(s.nextInt());
				System.out.println("Enter employee name:");
				emp.setEname(s.next());
				System.out.println("Enter employee city:");
				emp.setEcity(s.next());
				System.out.println("Enter employee salary:");
				emp.setEsal(s.nextFloat());
				service.storeIntoMap(emp);
				System.out.println("Updated");
				break;
			
			case 5:
				break;
				
			default:
				System.out.println("invalid case");
				break;
			}

		} while (n != 5);

		
		
	}
	
}
