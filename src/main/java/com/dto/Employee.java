package com.dto;

public class Employee {
	private int employeeId;
	private String name;
	private int salary;
	private String state;
	public int getEmployee_id() {
		return employeeId;
	}
	public void setEmployee_id(int employee_id) {
		this.employeeId = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return employeeId + ", " + name + ", " + salary + ", " + state;
	}
	
	
}
