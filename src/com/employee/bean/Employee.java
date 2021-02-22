package com.employee.bean;

/**
 * @author Mri scan
 *
 */
public class Employee {

	/**
	 * 
	 */
	private int eid;
	private String ename, ecity;
	private float esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "ID=" + eid + "\nName=" + ename + "\nCity=" + ecity + "\nSalary=" + esal;
	}
	
	
}
